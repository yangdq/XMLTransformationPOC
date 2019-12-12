declare namespace soapenv = "http://schemas.xmlsoap.org/soap/envelope/";
declare namespace per = "http://www.maximus.com/loaneligibility/person/";
declare variable $labelLinkUri as xs:string external;
let $x := doc($labelLinkUri)/soapenv:Envelope/soapenv:Body/per:PersonDetailsRequest/per:name
return data($x)
