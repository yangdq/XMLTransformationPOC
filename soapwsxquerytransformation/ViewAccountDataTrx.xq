(:: pragma bea:schema-type-parameter parameter="$accountDataParam" type="ns0:accountData" location="../schema/ServiceClientWSSchema.xsd" ::)
(:: pragma bea:schema-type-return type="ns1:accountData" location="../schema/FLHKWebServiceSchema.xsd" ::)

declare namespace ns1 = "http://webservice.flhk.com/FLHKWebService/1.0";
declare namespace ns0 = "http://services.vida.psi.com/ServiceClient/1.0";
declare namespace xf = "http://tempuri.org/FLHKServices/Resources/transformation/ViewAccountDataTrx/";
declare namespace S = "http://schemas.xmlsoap.org/soap/envelope/";

declare function xf:notNullOrEmptyElement($dateParam as element(*))
as xs:boolean {
	if( exists($dateParam) and not(empty($dateParam)))
	then true()
	else false()
};

declare function xf:getDateFromCalendarDay($calendarDay as element(*)) 
	as element(*) {

	if( xf:notNullOrEmptyElement($calendarDay))
	then 
		let $elemName := name($calendarDay)
		let $day := $calendarDay/day
		let $month := $calendarDay/month 
		let $year := $calendarDay/year 
		return element { $elemName } 
		{
			xs:date(concat($year,"-",xf:zeroPad($month),"-",xf:zeroPad($day))) 
		}
	else ()

};

declare function xf:zeroPad($num as xs:string)
	as xs:string {
		if( string-length($num) < 2 )
		then 
			concat("0", $num)
		else 
			$num
};

declare function xf:ViewAccountDataTrx($accountDataParam as element())
    as element() {
        <ns1:accountData>
            <members>
                {
            		for $member in $accountDataParam/members/member/accountMembership/parentType[text() >= 'PARENT']/../..
            		return
            			xf:MemberToParentTrx($member)
            	}
            	{
            		(: TODO isChild Switch to applying for benefits flag per REQ/Ann :)
            		for $member in $accountDataParam/members/member/accountMembership/applyingForBenefitsIndicator[text() = 'true']/../..
            		return
            			xf:MemberToChildTrx($member)
            	}
            	{
            		(: TODO isChild Switch to applying for benefits flag per REQ/Ann :)
            		for $member in $accountDataParam/members/member/accountMembership[not(parentType) and applyingForBenefitsIndicator[text() = 'false']]/..
            		return
            			xf:MemberToOtherTrx($member)
            	}
            </members>
            <accountNumber>{ data($accountDataParam/accountNumber) }</accountNumber>
            <defaultLanguage>{ data($accountDataParam/defaultLanguage) }</defaultLanguage>
            
            <letters>
                {
	                for $letterRequest in $accountDataParam/letters/letterRequest
	                return
	                    <letterRequest>
	                        {
	                            for $letterRequestId in $letterRequest/letterRequestId
	                            return
	                                <letterRequestId>{ data($letterRequestId) }</letterRequestId>
	                        }
	                        {
	                            for $letterType in $letterRequest/letterType
	                            return
	                                <letterType>{ data($letterType) }</letterType>
	                        }
	                        {
	                            for $statusDate in $letterRequest/statusDate
	                            return
	                                <statusDate>{ data($statusDate) }</statusDate>
	                        }
	                    </letterRequest>
            	
            	 }     
            </letters>
                 
            
            {
                let $accountContactInfo := $accountDataParam/accountContactInfo
                return
                    <accountContactInfo>
                        {
                            for $cellPhone in $accountContactInfo/cellPhone
                            return
                                <cellPhone>{ data($cellPhone) }</cellPhone>
                        }
                        {
                            for $emailBadAddress in $accountContactInfo/emailBadAddress
                            return
                                <emailBadAddress>{ data($emailBadAddress) }</emailBadAddress>
                        }
                        {
                            for $emailAddress in $accountContactInfo/emailAddress
                            return
                                <emailAddress>{ data($emailAddress) }</emailAddress>
                        }
                        {
                            for $homeAddress in $accountContactInfo/homeAddress
                            return
                                <homeAddress>
                                    {
                                        for $line1 in $homeAddress/line1
                                        return
                                            <line1>{ data($line1) }</line1>
                                    }
                                    {
                                        for $line2 in $homeAddress/line2
                                        return
                                            <line2>{ data($line2) }</line2>
                                    }
                                    {
                                        for $city in $homeAddress/city
                                        return
                                            <city>{ data($city) }</city>
                                    }
                                    {
                                        for $county in $homeAddress/county
                                        return
                                            <county>{ data($county) }</county>
                                    }
                                    {
                                        for $state in $homeAddress/state
                                        return
                                            <state>{ data($state) }</state>
                                    }
                                    {
                                        for $zipCode in $homeAddress/zipCode
                                        return
                                            <zipCode>{ data($zipCode) }</zipCode>
                                    }
                                    {
                                        if(exists($homeAddress/validated) and data($homeAddress/validated) eq 'VALID') 
                                        then 
                                            <validated>true</validated>
                                        else
                                            <validated>false</validated>
                                    }
                                    
                                </homeAddress>
                        }
                        {
                            for $homePhone in $accountContactInfo/homePhone
                            return
                                <homePhone>{ data($homePhone) }</homePhone>
                        }
                        {
                            for $mailingAddress in $accountContactInfo/mailingAddress
                            return
                                <mailingAddress>
                                    {
                                        for $line1 in $mailingAddress/line1
                                        return
                                            <line1>{ data($line1) }</line1>
                                    }
                                    {
                                        for $line2 in $mailingAddress/line2
                                        return
                                            <line2>{ data($line2) }</line2>
                                    }
                                    {
                                        for $city in $mailingAddress/city
                                        return
                                            <city>{ data($city) }</city>
                                    }
                                    {
                                        for $county in $mailingAddress/county
                                        return
                                            <county>{ data($county) }</county>
                                    }
                                    {
                                        for $state in $mailingAddress/state
                                        return
                                            <state>{ data($state) }</state>
                                    }
                                    {
                                        for $zipCode in $mailingAddress/zipCode
                                        return
                                            <zipCode>{ data($zipCode) }</zipCode>
                                    }
                                    {
                                        if(exists($mailingAddress/validated) and data($mailingAddress/validated) eq 'VALID' ) 
                                        then 
                                            <validated>true</validated>
                                        else
                                            <validated>false</validated>                  
                                     }
                                    
                                </mailingAddress>
                        }
                        <homeAndMailingAddressAreSame>{ data($accountContactInfo/homeAndMailingAddressAreSame) }</homeAndMailingAddressAreSame>
                        {
                            for $jpaVersion in $accountContactInfo/jpaVersion
                            return
                                <jpaVersion>{ data($jpaVersion) }</jpaVersion>
                        }
                        {
                            for $preferredContactMethod in $accountContactInfo/preferredContactMethod
                            return
                                <preferredContactMethod>{ data($preferredContactMethod) }</preferredContactMethod>
                        }
                    </accountContactInfo>
            }
            {
                for $pregnancyDueDate in $accountDataParam/pregnancyDueDate
                return
                    xf:getDateFromCalendarDay($pregnancyDueDate)
            }
            <inRenewal>{ data($accountDataParam/inRenewal) }</inRenewal>
            <enableRequestForCoupon>{ data($accountDataParam/enableRequestForCoupon) }</enableRequestForCoupon>
            {
                let $paymentInformation := $accountDataParam/paymentInformation
                return
                    <paymentInformation>
                        {
                            for $paymentStatus in $paymentInformation/paymentStatus
                            return
                                <paymentStatus>{ data($paymentStatus) }</paymentStatus>
                        }
			            {
			                for $nextDueDate in $paymentInformation/nextDueDate
			                return
			                    xf:getDateFromCalendarDay($nextDueDate)
			            }
                        {
                            for $amountDue in $paymentInformation/amountDue
                            return
                                <amountDue>{ data($amountDue) }</amountDue>
                        }
			            {
			                for $lastPaymentReceivedDate in $paymentInformation/lastPaymentReceivedDate
			                return
			                    xf:getDateFromCalendarDay($lastPaymentReceivedDate)
			            }
                        {
                            for $lastPaymentAmountReceived in $paymentInformation/lastPaymentAmountReceived
                            return
                                <lastPaymentAmountReceived>{ data($lastPaymentAmountReceived) }</lastPaymentAmountReceived>
                        }
                        {
                            for $accountBalance in $paymentInformation/accountBalance
                            return
                                <accountBalance>{ data($accountBalance) }</accountBalance>
                        }
                    </paymentInformation>
            }
            
            {
                for $accountMissingInfoItems in $accountDataParam/accountMissingInfoItems
                return
                    <accountMissingInfo>
                        {
                            for $accountMissingInfoItem in $accountMissingInfoItems/accountMissingInfoItem
                            return
                                <accountMissingInfoItem>{ data($accountMissingInfoItem) }</accountMissingInfoItem>
                        }
                    </accountMissingInfo>
            }
            <jpaVersion>{ data($accountDataParam/jpaVersion) }</jpaVersion>
        </ns1:accountData>
};

declare function xf:MemberToParentTrx($member as element())
    as element() {
     <parent>
            {
                for $accountMembershipNumber in $member/accountMembership/accountMembershipNumber
                return
                    <accountMembershipNumber>{ data($accountMembershipNumber) }</accountMembershipNumber>
            }
            {
                for $name in $member/accountMembership/person/name
                return
                    <personName>
                        {
                            for $firstName in $name/firstName
                            return
                                <firstName>{ data($firstName) }</firstName>
                        }
                        {
                            for $middleInitial in $name/middleInitial
                            return
                                <middleInitial>{ data($middleInitial) }</middleInitial>
                        }
                        {
                            for $lastName in $name/lastName
                            return
                                <lastName>{ data($lastName) }</lastName>
                        }
                        {
                            for $suffix in $name/suffix
                            return
                                <suffix>{ data($suffix) }</suffix>
                        }
                    </personName>
            }
            {
                for $ssn in $member/accountMembership/person/ssn
                return
                    <ssn>{ data($ssn) }</ssn>
            }
            {
                for $dateOfBirth in $member/accountMembership/person/dateOfBirth
                return
                    xf:getDateFromCalendarDay($dateOfBirth)
            }
            {
                for $gender in $member/accountMembership/person/gender
                return
                    <gender>{ data($gender) }</gender>
            }
            {
                for $expenses in $member/expenses
                return
                    <expenses>
                        {
                            for $expense in $expenses/expense
                            return
                                <expense>
                                    {
                                        for $expenseNumber in $expense/expenseNumber
                                        return
                                            <expenseNumber>{ data($expenseNumber) }</expenseNumber>
                                    }
                                    {
                                        for $expenseStatus in $expense/entityStatus
                                        return
                                            <expenseStatus>{ data($expenseStatus) }</expenseStatus>
                                    }
                                    {
                                        for $nameOfCaredForPerson in $expense/nameOfCaredForPerson
                                        return
                                            <nameOfCaredForPerson>{ data($nameOfCaredForPerson) }</nameOfCaredForPerson>
                                    }
                                    {
                                        for $reportedMonthlyAmount in $expense/reportedMonthlyAmount
                                        return
                                            <reportedMonthlyAmount>{ data($reportedMonthlyAmount) }</reportedMonthlyAmount>
                                    }
                                    {
                                        for $type in $expense/type
                                        return
                                            <type>{ data($type) }</type>
                                    }
                                    {
                                        for $jpaVersion in $expense/jpaVersion
                                        return
                                            <jpaVersion>{ data($jpaVersion) }</jpaVersion>
                                    }
                                </expense>
                        }
                    </expenses>
            }
            {
                for $incomes in $member/incomes
                return
                    <incomes>
                        {
                            for $income in $incomes/income
                            return
                                <income>
                                    {
                                        for $incomeNumber in $income/incomeNumber
                                        return
                                            <incomeNumber>{ data($incomeNumber) }</incomeNumber>
                                    }
                                    {
                                        for $incomeStatus in $income/entityStatus
                                        return
                                            <incomeStatus>{ data($incomeStatus) }</incomeStatus>
                                    }
                                    {
                                        for $reportedMonthlyAmount in $income/reportedMonthlyAmount
                                        return
                                            <monthlyAmount>{ data($reportedMonthlyAmount) }</monthlyAmount>
                                    }
                                    {
                                        for $employerName in $income/employerName
                                        return
                                            <employerName>{ data($employerName) }</employerName>
                                    }
                                    {
                                        for $frequency in $income/frequency
                                        return
                                            <frequency>{ data($frequency) }</frequency>
                                    }
                                    {
                                        for $hoursWorkedPerWeek in $income/hoursWorkedPerWeek
                                        return
                                            <hoursWorkedPerWeek>{ data($hoursWorkedPerWeek) }</hoursWorkedPerWeek>
                                    }
                                    {
                                        for $type in $income/type
                                        return
                                            <type>{ data($type) }</type>
                                    }
                                    {
                                        for $subType in $income/subType
                                        return
                                            <subType>{ data($subType) }</subType>
                                    }
                                    {
                                        for $jpaVersion in $income/jpaVersion
                                        return
                                            <jpaVersion>{ data($jpaVersion) }</jpaVersion>
                                    }
                                </income>
                        }
                    </incomes>
            }
            {
                for $jpaVersion in $member/accountMembership/person/jpaVersion
                return
                    <jpaVersion>{ data($jpaVersion) }</jpaVersion>
            }
            {
                for $jpaVersion in $member/accountMembership/jpaVersion
                return
                    <amJpaVersion>{ data($jpaVersion) }</amJpaVersion>
            }
            {
                for $workPhone in $member/accountMembership/person/workPhone
                return
                    <workPhone>{ data($workPhone) }</workPhone>
            }
            {
                for $memberMissingInfoItems in $member/memberMissingInfoItems
                return
                    <memberMissingInfo>
                        {
                            for $memberMissingInfoItem in $memberMissingInfoItems/memberMissingInfoItem
                            return
                                <memberMissingInfoItem>{ data($memberMissingInfoItem) }</memberMissingInfoItem>
                        }
					</memberMissingInfo>
            }
            {
                for $expenseMissingInfoItems in $member/expenseMissingInfoItems
                return
                    <expenseMissingInfo>
                        {
                            for $expenseMissingInfoItem in $expenseMissingInfoItems/expenseMissingInfoItem
                            return
                                <expenseMissingInfoItem>{ data($expenseMissingInfoItem) }</expenseMissingInfoItem>
                        }
					</expenseMissingInfo>
            }
            {
                for $incomeMissingInfoItems in $member/incomeMissingInfoItems
                return
                    <incomeMissingInfo>
                        {
                            for $incomeMissingInfoItem in $incomeMissingInfoItems/incomeMissingInfoItem
                            return
                                <incomeMissingInfoItem>{ data($incomeMissingInfoItem) }</incomeMissingInfoItem>
                        }
					</incomeMissingInfo>
            }
            {
                for $fullTimeStudent in $member/accountMembership/person/fullTimeStudent
                return
                    <fullTimeStudentIndicator>{ data($fullTimeStudent) }</fullTimeStudentIndicator>
            }
            {
                for $parentType in $member/accountMembership/parentType
                return
                    <parentType>{ data($parentType) }</parentType>
            }
     </parent>
};

declare function xf:MemberToChildTrx($member as element())
    as element() {
     <child>
            {
                for $accountMembershipNumber in $member/accountMembership/accountMembershipNumber
                return
                    <accountMembershipNumber>{ data($accountMembershipNumber) }</accountMembershipNumber>
            }
            {
                for $personNumber in $member/accountMembership/person/personNumber
                return
                    <memberId>{ data($personNumber) }</memberId>
            }
            {
                for $name in $member/accountMembership/person/name
                return
                    <personName>
                        {
                            for $firstName in $name/firstName
                            return
                                <firstName>{ data($firstName) }</firstName>
                        }
                        {
                            for $middleInitial in $name/middleInitial
                            return
                                <middleInitial>{ data($middleInitial) }</middleInitial>
                        }
                        {
                            for $lastName in $name/lastName
                            return
                                <lastName>{ data($lastName) }</lastName>
                        }
                        {
                            for $suffix in $name/suffix
                            return
                                <suffix>{ data($suffix) }</suffix>
                        }
                    </personName>
            }
            {
                for $ssn in $member/accountMembership/person/ssn
                return
                    <ssn>{ data($ssn) }</ssn>
            }
            {
                for $dateOfBirth in $member/accountMembership/person/dateOfBirth
                return
                    xf:getDateFromCalendarDay($dateOfBirth)
            }
            {
                for $gender in $member/accountMembership/person/gender
                return
                    <gender>{ data($gender) }</gender>
            }
            {
                for $expenses in $member/expenses
                return
                    <expenses>
                        {
                            for $expense in $expenses/expense
                            return
                                <expense>
                                    {
                                        for $expenseNumber in $expense/expenseNumber
                                        return
                                            <expenseNumber>{ data($expenseNumber) }</expenseNumber>
                                    }
                                    {
                                        for $nameOfCaredForPerson in $expense/nameOfCaredForPerson
                                        return
                                            <nameOfCaredForPerson>{ data($nameOfCaredForPerson) }</nameOfCaredForPerson>
                                    }
                                    {
                                        for $reportedMonthlyAmount in $expense/reportedMonthlyAmount
                                        return
                                            <reportedMonthlyAmount>{ data($reportedMonthlyAmount) }</reportedMonthlyAmount>
                                    }
                                    {
                                        for $type in $expense/type
                                        return
                                            <type>{ data($type) }</type>
                                    }
                                    {
                                        for $jpaVersion in $expense/jpaVersion
                                        return
                                            <jpaVersion>{ data($jpaVersion) }</jpaVersion>
                                    }
                                </expense>
                        }
                    </expenses>
            }
            {
                for $incomes in $member/incomes
                return
                    <incomes>
                        {
                            for $income in $incomes/income
                            return
                                <income>
                                    {
                                        for $incomeNumber in $income/incomeNumber
                                        return
                                            <incomeNumber>{ data($incomeNumber) }</incomeNumber>
                                    }
                                    {
                                        for $reportedMonthlyAmount in $income/reportedMonthlyAmount
                                        return
                                            <monthlyAmount>{ data($reportedMonthlyAmount) }</monthlyAmount>
                                    }
                                    {
                                        for $employerName in $income/employerName
                                        return
                                            <employerName>{ data($employerName) }</employerName>
                                    }
                                    {
                                        for $frequency in $income/frequency
                                        return
                                            <frequency>{ data($frequency) }</frequency>
                                    }
                                    {
                                        for $hoursWorkedPerWeek in $income/hoursWorkedPerWeek
                                        return
                                            <hoursWorkedPerWeek>{ data($hoursWorkedPerWeek) }</hoursWorkedPerWeek>
                                    }
                                    {
                                        for $type in $income/type
                                        return
                                            <type>{ data($type) }</type>
                                    }
                                    {
                                        for $subType in $income/subType
                                        return
                                            <subType>{ data($subType) }</subType>
                                    }
                                    {
                                        for $jpaVersion in $income/jpaVersion
                                        return
                                            <jpaVersion>{ data($jpaVersion) }</jpaVersion>
                                    }
                                </income>
                        }
                    </incomes>
            }
            {
                for $jpaVersion in $member/accountMembership/person/jpaVersion
                return
                    <jpaVersion>{ data($jpaVersion) }</jpaVersion>
            }
            {
                for $jpaVersion in $member/accountMembership/jpaVersion
                return
                    <amJpaVersion>{ data($jpaVersion) }</amJpaVersion>
            }
            {
                for $jpaVersion in $member/accountMembership/person/workPhone
                return
                    <workPhone>{ data($jpaVersion) }</workPhone>
            }
           {
                for $currentEnrolledHealthPlan in $member/currentEnrolledHealthPlan
                return
                    <currentMonthEnrollment>
                        {
                            for $coverageMonth in $currentEnrolledHealthPlan/coverageMonth
                            return
                                <coverageMonth>{ data($coverageMonth) }</coverageMonth>
                        }
                        {
                            for $dentalPlan in $currentEnrolledHealthPlan/dentalPlan
                            return
                                <dentalPlan>
			                        {
			                            for $healthPlan in $dentalPlan/healthPlanName
			                            return
			                                <healthPlan>{ data($healthPlan) }</healthPlan>
			                        }
			                        {
			                            for $healthPlanEmail in $dentalPlan/emailAddress
			                            return
			                                <healthPlanEmail>{ data($healthPlanEmail) }</healthPlanEmail>
			                        }
			                        {
			                            for $healthPlanPhoneNumber in $dentalPlan/phoneNumber
			                            return
			                                <healthPlanPhoneNumber>{ data($healthPlanPhoneNumber) }</healthPlanPhoneNumber>
			                        }
			                        {
			                            for $healthPlanWebSite in $dentalPlan/webSiteAddress
			                            return
			                                <healthPlanWebSite>{ data($healthPlanWebSite) }</healthPlanWebSite>
			                        }
                                </dentalPlan>
                        }
                        {
                        	for $dentalPlanId in $currentEnrolledHealthPlan/dentalPlanId
                        	return 
                        		<dentalPlanId>{ data($dentalPlanId) }</dentalPlanId>
                        }
                        {
                            for $medicalEnrollmentStatus in $currentEnrolledHealthPlan/medicalEnrollmentStatus
                            return
                                <medicalEnrollmentStatus>{ data($medicalEnrollmentStatus) }</medicalEnrollmentStatus>
                        }
                        {
                            for $enrollmentDisplayStatus in $currentEnrolledHealthPlan/enrollmentDisplayStatus
                            return
                                <enrollmentDisplayStatus>{ data($enrollmentDisplayStatus) }</enrollmentDisplayStatus>
                        }
                        {
                            for $medicalPlan in $currentEnrolledHealthPlan/medicalPlan
                            return
                                <medicalPlan>
			                        {
			                            for $healthPlan in $medicalPlan/healthPlanName
			                            return
			                                <healthPlan>{ data($healthPlan) }</healthPlan>
			                        }
			                        {
			                            for $healthPlanEmail in $medicalPlan/emailAddress
			                            return
			                                <healthPlanEmail>{ data($healthPlanEmail) }</healthPlanEmail>
			                        }
			                        {
			                            for $healthPlanPhoneNumber in $medicalPlan/phoneNumber
			                            return
			                                <healthPlanPhoneNumber>{ data($healthPlanPhoneNumber) }</healthPlanPhoneNumber>
			                        }
			                        {
			                            for $healthPlanWebSite in $medicalPlan/webSiteAddress
			                            return
			                                <healthPlanWebSite>{ data($healthPlanWebSite) }</healthPlanWebSite>
			                        }
                                </medicalPlan>
                        }
                        {
                        	for $medicalPlanId in $currentEnrolledHealthPlan/medicalPlanId
                        	return 
                        		<medicalPlanId>{ data($medicalPlanId) }</medicalPlanId>
                        }
                        {
                            for $programName in $currentEnrolledHealthPlan/programName
                            return
                                <programName>{ data($programName) }</programName>
                        }
                    </currentMonthEnrollment>
            }
            {
                for $nextMonthEnrolledHealthPlan in $member/nextMonthEnrolledHealthPlan
                return
                    <nextMonthEnrollment>
                        {
                            for $coverageMonth in $nextMonthEnrolledHealthPlan/coverageMonth
                            return
                                <coverageMonth>{ data($coverageMonth) }</coverageMonth>
                        }
                        {
                            for $dentalPlan in $nextMonthEnrolledHealthPlan/dentalPlan
                            return
                                <dentalPlan>
			                        {
			                            for $healthPlan in $dentalPlan/healthPlanName
			                            return
			                                <healthPlan>{ data($healthPlan) }</healthPlan>
			                        }
			                        {
			                            for $healthPlanEmail in $dentalPlan/emailAddress
			                            return
			                                <healthPlanEmail>{ data($healthPlanEmail) }</healthPlanEmail>
			                        }
			                        {
			                            for $healthPlanPhoneNumber in $dentalPlan/phoneNumber
			                            return
			                                <healthPlanPhoneNumber>{ data($healthPlanPhoneNumber) }</healthPlanPhoneNumber>
			                        }
			                        {
			                            for $healthPlanWebSite in $dentalPlan/webSiteAddress
			                            return
			                                <healthPlanWebSite>{ data($healthPlanWebSite) }</healthPlanWebSite>
			                        }
                                </dentalPlan>
                        }
                        {
                        	for $dentalPlanId in $nextMonthEnrolledHealthPlan/dentalPlanId
                        	return 
                        		<dentalPlanId>{ data($dentalPlanId) }</dentalPlanId>
                        }
                        {
                            for $medicalEnrollmentStatus in $nextMonthEnrolledHealthPlan/medicalEnrollmentStatus
                            return
                                <medicalEnrollmentStatus>{ data($medicalEnrollmentStatus) }</medicalEnrollmentStatus>
                        }
                        {
                            for $enrollmentDisplayStatus in $nextMonthEnrolledHealthPlan/enrollmentDisplayStatus
                            return
                                <enrollmentDisplayStatus>{ data($enrollmentDisplayStatus) }</enrollmentDisplayStatus>
                        }
                        {
                            for $medicalPlan in $nextMonthEnrolledHealthPlan/medicalPlan
                            return
                                <medicalPlan>
			                        {
			                            for $healthPlan in $medicalPlan/healthPlanName
			                            return
			                                <healthPlan>{ data($healthPlan) }</healthPlan>
			                        }
			                        {
			                            for $healthPlanEmail in $medicalPlan/emailAddress
			                            return
			                                <healthPlanEmail>{ data($healthPlanEmail) }</healthPlanEmail>
			                        }
			                        {
			                            for $healthPlanPhoneNumber in $medicalPlan/phoneNumberAddress
			                            return
			                                <healthPlanPhoneNumber>{ data($healthPlanPhoneNumber) }</healthPlanPhoneNumber>
			                        }
			                        {
			                            for $healthPlanWebSite in $medicalPlan/webSiteAddress
			                            return
			                                <healthPlanWebSite>{ data($healthPlanWebSite) }</healthPlanWebSite>
			                        }
                                </medicalPlan>
                        }
                        {
                        	for $medicalPlanId in $nextMonthEnrolledHealthPlan/medicalPlanId
                        	return 
                        		<medicalPlanId>{ data($medicalPlanId) }</medicalPlanId>
                        }
                        {
                            for $programName in $nextMonthEnrolledHealthPlan/programName
                            return
                                <programName>{ data($programName) }</programName>
                        }
                    </nextMonthEnrollment>
            }
            {
                for $memberMissingInfoItems in $member/memberMissingInfoItems
                return
                    <memberMissingInfo>
                        {
                            for $memberMissingInfoItem in $memberMissingInfoItems/memberMissingInfoItem
                            return
                                <memberMissingInfoItem>{ data($memberMissingInfoItem) }</memberMissingInfoItem>
                        }
					</memberMissingInfo>
            }
            {
                for $expenseMissingInfoItems in $member/expenseMissingInfoItems
                return
                    <expenseMissingInfo>
                        {
                            for $expenseMissingInfoItem in $expenseMissingInfoItems/expenseMissingInfoItem
                            return
                                <expenseMissingInfoItem>{ data($expenseMissingInfoItem) }</expenseMissingInfoItem>
                        }
					</expenseMissingInfo>
            }
            {
                for $incomeMissingInfoItems in $member/incomeMissingInfoItems
                return
                    <incomeMissingInfo>
                        {
                            for $incomeMissingInfoItem in $incomeMissingInfoItems/incomeMissingInfoItem
                            return
                                <incomeMissingInfoItem>{ data($incomeMissingInfoItem) }</incomeMissingInfoItem>
                        }
					</incomeMissingInfo>
            }
            {
                for $fullTimeStudent in $member/accountMembership/person/fullTimeStudent
                return
                    <fullTimeStudentIndicator>{ data($fullTimeStudent) }</fullTimeStudentIndicator>
            }
            {
                for $applyingForBenefitsIndicator in $member/accountMembership/applyingForBenefitsIndicator
                return
                    <applyingForKidCare>{ data($applyingForBenefitsIndicator) }</applyingForKidCare>
            }
            {
                for $inMedicalChoicePeriod in $member/inMedicalChoicePeriod
                return
                    <inMedicalChoicePeriod>{ data($inMedicalChoicePeriod) }</inMedicalChoicePeriod>
            }
            {
                for $inDentalChoicePeriod in $member/inDentalChoicePeriod
                return
                    <inDentalChoicePeriod>{ data($inDentalChoicePeriod) }</inDentalChoicePeriod>
            }
            {
                for $availableHealthPlans in $member/availableHealthPlans
                return
                    <availableMedicalPlans>
                        {
                            for $healthPlan in $availableHealthPlans/healthPlan
                            return
                                <healthPlan>
                                    {
                                        for $healthPlan in $healthPlan/healthPlanName
                                        return
                                            <healthPlan>{ data($healthPlan) }</healthPlan>
                                    }
                                    {
                                        for $healthPlanEmail in $healthPlan/emailAddress
                                        return
                                            <healthPlanEmail>{ data($healthPlanEmail) }</healthPlanEmail>
                                    }
                                    {
                                        for $healthPlanPhoneNumber in $healthPlan/phoneNumber
                                        return
                                            <healthPlanPhoneNumber>{ data($healthPlanPhoneNumber) }</healthPlanPhoneNumber>
                                    }
                                    {
                                        for $healthPlanWebSite in $healthPlan/webSiteAddress
                                        return
                                            <healthPlanWebSite>{ data($healthPlanWebSite) }</healthPlanWebSite>
                                    }
                                </healthPlan>
                        }
                    </availableMedicalPlans>
            }
            {
                for $availableDentalPlans in $member/availableDentalPlans
                return
                    <availableDentalPlans>
                        {
                            for $healthPlan in $availableDentalPlans/dentalPlan
                            return
                                <dentalPlan>
                                    {
                                        for $healthPlan in $healthPlan/healthPlanName
                                        return
                                            <healthPlan>{ data($healthPlan) }</healthPlan>
                                    }
                                    {
                                        for $healthPlanEmail in $healthPlan/emailAddress
                                        return
                                            <healthPlanEmail>{ data($healthPlanEmail) }</healthPlanEmail>
                                    }
                                    {
                                        for $healthPlanPhoneNumber in $healthPlan/phoneNumber
                                        return
                                            <healthPlanPhoneNumber>{ data($healthPlanPhoneNumber) }</healthPlanPhoneNumber>
                                    }
                                    {
                                        for $healthPlanWebSite in $healthPlan/webSiteAddress
                                        return
                                            <healthPlanWebSite>{ data($healthPlanWebSite) }</healthPlanWebSite>
                                    }
                                </dentalPlan>
                        }
                    </availableDentalPlans>
            }
     </child>
};

declare function xf:MemberToOtherTrx($member as element())
    as element() {
    <otherPerson>
            {
                for $accountMembershipNumber in $member/accountMembership/accountMembershipNumber
                return
                    <accountMembershipNumber>{ data($accountMembershipNumber) }</accountMembershipNumber>
            }
            {
                for $name in $member/accountMembership/person/name
                return
                    <personName>
                        {
                            for $firstName in $name/firstName
                            return
                                <firstName>{ data($firstName) }</firstName>
                        }
                        {
                            for $middleInitial in $name/middleInitial
                            return
                                <middleInitial>{ data($middleInitial) }</middleInitial>
                        }
                        {
                            for $lastName in $name/lastName
                            return
                                <lastName>{ data($lastName) }</lastName>
                        }
                        {
                            for $suffix in $name/suffix
                            return
                                <suffix>{ data($suffix) }</suffix>
                        }
                    </personName>
            }
            {
                for $ssn in $member/accountMembership/person/ssn
                return
                    <ssn>{ data($ssn) }</ssn>
            }
            {
                for $dateOfBirth in $member/accountMembership/person/dateOfBirth
                return
                    xf:getDateFromCalendarDay($dateOfBirth)
            }
            {
                for $gender in $member/accountMembership/person/gender
                return
                    <gender>{ data($gender) }</gender>
            }
            {
                for $expenses in $member/expenses
                return
                    <expenses>
                        {
                            for $expense in $expenses/expense
                            return
                                <expense>
                                    {
                                       	(: Need to determine where this comes from in Vida... :)
                                        for $expenseNumber in $expense/expenseNumber
                                        return
                                            <expenseNumber>{ data($expenseNumber) }</expenseNumber>
                                    }
                                    {
                                        for $nameOfCaredForPerson in $expense/nameOfCaredForPerson
                                        return
                                            <nameOfCaredForPerson>{ data($nameOfCaredForPerson) }</nameOfCaredForPerson>
                                    }
                                    {
                                        for $reportedMonthlyAmount in $expense/reportedMonthlyAmount
                                        return
                                            <reportedMonthlyAmount>{ data($reportedMonthlyAmount) }</reportedMonthlyAmount>
                                    }
                                    {
                                        for $type in $expense/type
                                        return
                                            <type>{ data($type) }</type>
                                    }
                                    {
                                        for $jpaVersion in $expense/jpaVersion
                                        return
                                            <jpaVersion>{ data($jpaVersion) }</jpaVersion>
                                    }
                                </expense>
                        }
                    </expenses>
            }
            {
                for $incomes in $member/incomes
                return
                    <incomes>
                        {
                            for $income in $incomes/income
                            return
                                <income>
                                    {
                                       	(: Need to determine where this comes from in Vida... :)
                                        for $incomeNumber in $income/incomeNumber
                                        return
                                            <incomeNumber>{ data($incomeNumber) }</incomeNumber>
                                    }
                                    {
                                        for $reportedMonthlyAmount in $income/reportedMonthlyAmount
                                        return
                                            <monthlyAmount>{ data($reportedMonthlyAmount) }</monthlyAmount>
                                    }
                                    {
                                        for $employerName in $income/employerName
                                        return
                                            <employerName>{ data($employerName) }</employerName>
                                    }
                                    {
                                        for $frequency in $income/frequency
                                        return
                                            <frequency>{ data($frequency) }</frequency>
                                    }
                                    {
                                        for $hoursWorkedPerWeek in $income/hoursWorkedPerWeek
                                        return
                                            <hoursWorkedPerWeek>{ data($hoursWorkedPerWeek) }</hoursWorkedPerWeek>
                                    }
                                    {
                                        for $type in $income/type
                                        return
                                            <type>{ data($type) }</type>
                                    }
                                    {
                                        for $subType in $income/subType
                                        return
                                            <subType>{ data($subType) }</subType>
                                    }
                                    {
                                        for $jpaVersion in $income/jpaVersion
                                        return
                                            <jpaVersion>{ data($jpaVersion) }</jpaVersion>
                                    }
                                </income>
                        }
                    </incomes>
            }
            {
                for $jpaVersion in $member/accountMembership/person/jpaVersion
                return
                    <jpaVersion>{ data($jpaVersion) }</jpaVersion>
            }
            {
                for $jpaVersion in $member/accountMembership/jpaVersion
                return
                    <amJpaVersion>{ data($jpaVersion) }</amJpaVersion>
            }
    </otherPerson>
};

declare variable $labelLinkUri as xs:string external;
let $x := doc($labelLinkUri)/S:Envelope/S:Body/ns0:viewAccountDataResponse/return 
return xf:ViewAccountDataTrx($x)