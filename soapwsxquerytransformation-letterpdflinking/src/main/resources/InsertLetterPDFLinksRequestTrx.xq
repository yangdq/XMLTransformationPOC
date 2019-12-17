(:: pragma bea:schema-type-parameter parameter="$insertLetterPDFLinksParam" type="ns1:insertLetterPDFLinks" location="../schema/LetterManagerWSSchema.xsd" ::)
(:: pragma bea:schema-type-return type="ns0:insertLetterPDFLinks" location="../schema/VidaLetterManagerWSSchema.xsd" ::)

declare namespace ns1 = "http://webservice.flhk.com/FLHKWebService/1.0";
declare namespace ns0 = "http://services.vida.psi.com/LetterManagement/1.0";
declare namespace xf = "http://tempuri.org/FLHKServices/Resources/transformation/InsertLetterPDFLinksRequestTrx/";
declare namespace soapenv = "http://schemas.xmlsoap.org/soap/envelope/";
declare namespace ns = "http://webservice.flhk.com/FLHKWebService/1.0";

declare function xf:InsertLetterPDFLinksRequestTrx($insertLetterPDFLinksParam as element())
    as element() {
        let $insertLetterPDFLinks := $insertLetterPDFLinksParam
        return
            <ns0:insertLetterPDFLinks>
                {
                    for $fileName in $insertLetterPDFLinksParam/fileName
                    return
                        <fileName>{ data($fileName) }</fileName>
                }
                {
                    for $filePath in $insertLetterPDFLinksParam/filePath
                    return
                        <filePath>{ data($filePath) }</filePath>
                }
            </ns0:insertLetterPDFLinks>
};

declare variable $labelLinkUri as xs:string external;
let $x := doc($labelLinkUri)/soapenv:Envelope/soapenv:Body/ns:insertLetterPDFLinksRequest 
return xf:InsertLetterPDFLinksRequestTrx($x)
