# Validate XML against XSD

Based on given XML and XSD data, The system will validate XML against XSD. If XML is valid, The will return true. Otherwise return false.

Once you have deployed xml-validator rule on Kie-server, then it can be accessed 
through below Kie-server REST API. We can test this API using below payload.

# URI: 
    http://<ip>/kie-server/services/rest/server/containers/instances/{MyContainer}
# Method: 
    POST
# Path Param: 
    You need to pass deployed container id in {MyContainer} placeholder
    Example: in our case deployed container id is xml-validator_1.0.0, so
    http://<IP>/kie-server/services/rest/server/containers/instances/xml-validator_1.0.0
# Headers: 
    Content-Type: application/json
    Authorization: Basic ************

# Request Payload:       
        {
        "commands": [
            {
                "insert": {
                    "object": {
                        "XMLRequest": {
                            "xmlData": "<?xml version=\"1.0\" encoding=\"utf-8\"?> <TIMSProductMessage> <MsgHeader> <SenderName>TIMS</SenderName> <FileName>N/A</FileName> <DateTimeStamp>1234</DateTimeStamp> <TitleID>082671330</TitleID> </MsgHeader> <MsgPayload> <ONIXMessage> <Header><FromCompany>Ingram Book Company</FromCompany><FromPerson>Andy Stone</FromPerson><FromEmail>andy.stone@ingramcontent.com</FromEmail><SentDate>20230718</SentDate><DefaultLanguageOfText>eng</DefaultLanguageOfText><DefaultPriceTypeCode>01</DefaultPriceTypeCode><DefaultCurrencyCode>USD</DefaultCurrencyCode></Header> <Product> <RecordReference>082671330</RecordReference> <NotificationType>03</NotificationType> <ProductIdentifier> <ProductIDType>02</ProductIDType> <IDValue>0063308886</IDValue> </ProductIdentifier> <ProductIdentifier> <ProductIDType>03</ProductIDType> <IDValue>9780063308886</IDValue> </ProductIdentifier> <ProductIdentifier> <ProductIDType>14</ProductIDType> <IDValue>09780063308886</IDValue> </ProductIdentifier> <ProductIdentifier> <ProductIDType>15</ProductIDType> <IDValue>9780063308886</IDValue> </ProductIdentifier> <ProductForm>BC</ProductForm> <ProductFormDetail>B102</ProductFormDetail> <ProductFormDetail>B305</ProductFormDetail> <ProductClassification> <ProductClassificationType>01</ProductClassificationType> <ProductClassificationCode>4901.99.0075</ProductClassificationCode> </ProductClassification> <Series> <TitleOfSeries>A Mystwick School Novel</TitleOfSeries> </Series> <Title textcase=\"02\" language=\"eng\"> <TitleType>01</TitleType> <TitleText>The Midnight Orchestra</TitleText> <TitlePrefix>The</TitlePrefix> <TitleWithoutPrefix>Midnight Orchestra</TitleWithoutPrefix> </Title> <WorkIdentifier> <WorkIDType>01</WorkIDType> <IDTypeName>Ingram Family ID</IDTypeName> <IDValue>009611485</IDValue> </WorkIdentifier> <Contributor> <ContributorRole>A01</ContributorRole> <NamesBeforeKey>Jessica</NamesBeforeKey> <KeyNames>Khoury</KeyNames> <BiographicalNote><p><strong>Jessica Khoury </strong>is the author of multiple books for teens and young readers. In addition to writing, she is an artistic mapmaker and spends far too much time scribbling tiny mountains and trees for fictional worlds. Her spare hours are spent video gaming, painting, or cooking badly. She lives in Greenville, South Carolina, with her husband, daughters, and sassy husky Katara.</p></BiographicalNote> </Contributor> <Language> <LanguageRole>01</LanguageRole> <LanguageCode>eng</LanguageCode> </Language> <NumberOfPages>400</NumberOfPages> <BASICMainSubject>JUV037000</BASICMainSubject> <MainSubject> <MainSubjectSchemeIdentifier>10</MainSubjectSchemeIdentifier> <SubjectCode>JUV037000</SubjectCode> <SubjectHeadingText>Juvenile Fiction/Fantasy and Magic</SubjectHeadingText> </MainSubject> <Subject> <SubjectSchemeIdentifier>10</SubjectSchemeIdentifier> <SubjectCode>JUV031040</SubjectCode> <SubjectHeadingText>Juvenile Fiction/Performing Arts - Music</SubjectHeadingText> </Subject> <Subject> <SubjectSchemeIdentifier>10</SubjectSchemeIdentifier> <SubjectCode>JUV039060</SubjectCode> <SubjectHeadingText>Juvenile Fiction/Social Themes - Friendship</SubjectHeadingText> </Subject> <Subject> <SubjectSchemeIdentifier>10</SubjectSchemeIdentifier> <SubjectCode>JUV035000</SubjectCode> <SubjectHeadingText>Juvenile Fiction/School and Education</SubjectHeadingText> </Subject> <Subject> <SubjectSchemeIdentifier>10</SubjectSchemeIdentifier> <SubjectCode>JUV013060</SubjectCode> <SubjectHeadingText>Juvenile Fiction/Family - Parents</SubjectHeadingText> </Subject> <Subject> <SubjectSchemeIdentifier>20</SubjectSchemeIdentifier> <SubjectHeadingText>fantasy; contemporary fantasy; fantasy adventure; fiction; fiction books for kids; fiction for boys; fiction for girls; fiction for kids; fiction for tweens; fiction for young boys; fiction for young girls; kids fiction; childrens fiction; middle grade fiction; boys fiction; girls fiction; introverts; back to school books for kids; school; books for kids; friendship books for kids; gifts for kids; gift books for kids; fun books for kids; magic; making friends; friends; gifts for new parents; friendship; friendship book; kindness; kindness books for children; bedtime stories; music; performing arts; books for girls ages 9 10 11 12; singing; musical instruments; musical; boys; books for boys ages 9 10 11 12; free; instruments; middle grade; books for middle grade readers; middle grade series; books for 10 year olds; books for 11 year olds; books for 12 year olds; books for reluctant readers; love; urban; youth; kids; 2022; series; teens; fathers day gifts; kids books; pregnancy gifts; 2022 books; children; 7 days in june; new parents gifts; ya; jessica; young adult; gift; 2023; girl; art; mystery; e books; making; new; kid; young; day; childrens; boy; supernatural; pregnancy; back; friend; child; story; middle school; tweens; mg; parent; favorites; introvert; bedtime; music books for kids; high fantasy; sci fi fantasy; children s; children s books; children s lit; science fiction fantasy; 5 star; fantasy paranormal; listened; listened to; 2022 releases; mother day gifts; mage; 2023 books; teen; middle grades; adventure; girl power; maybe; boarding school; free kids books; 9; 8; 10; books for 8 year old boys; books for 8 year old girls; kids books ages 8 9 10; 12; books for 12 year old boys; books for 12 year old girls; books for 10 year old boys; books for 11 year old boys; books for 9 year old girls; 11; books for 9 year old boys; books for 11 year old girls; tween books for girls ages 11 12 13 14; childrens books ages 8 9 10 11 12; books for 8 year olds; middle grade contemporary fantasy; books for middle grade girls; books for kids age 10 11 12; kids value books; middle school fiction</SubjectHeadingText> </Subject> <Subject> <SubjectSchemeIdentifier>01</SubjectSchemeIdentifier> <SubjectCode>FIC</SubjectCode> </Subject> <Subject> <SubjectSchemeIdentifier>24</SubjectSchemeIdentifier> <SubjectSchemeName>INGRAM SUBJECT</SubjectSchemeName> <SubjectCode>CJ</SubjectCode> <SubjectHeadingText>Children's Books/Ages 9/12 Fiction</SubjectHeadingText> </Subject> <Subject> <SubjectSchemeIdentifier>24</SubjectSchemeIdentifier> <SubjectSchemeName>INGRAM THEME</SubjectSchemeName> <SubjectCode>TOPC/FAMILY</SubjectCode> <SubjectHeadingText>Topical/Family</SubjectHeadingText> </Subject> <Subject> <SubjectSchemeIdentifier>24</SubjectSchemeIdentifier> <SubjectSchemeName>INGRAM THEME</SubjectSchemeName> <SubjectCode>TOPC/FRIEND</SubjectCode> <SubjectHeadingText>Topical/Friendship</SubjectHeadingText> </Subject> <Subject> <SubjectSchemeIdentifier>24</SubjectSchemeIdentifier> <SubjectSchemeName>INGRAM THEME</SubjectSchemeName> <SubjectCode>TOPC/GIRLIN</SubjectCode> <SubjectHeadingText>Topical/Girl's Interest</SubjectHeadingText> </Subject> <Subject> <SubjectSchemeIdentifier>22</SubjectSchemeIdentifier> <SubjectCode>TP058</SubjectCode> </Subject> <Subject> <SubjectSchemeIdentifier>93</SubjectSchemeIdentifier> <SubjectCode>YFB</SubjectCode> </Subject> <Subject> <SubjectSchemeIdentifier>93</SubjectSchemeIdentifier> <SubjectCode>YFH</SubjectCode> </Subject> <Subject> <SubjectSchemeIdentifier>93</SubjectSchemeIdentifier> <SubjectCode>YFN</SubjectCode> </Subject> <Subject> <SubjectSchemeIdentifier>93</SubjectSchemeIdentifier> <SubjectCode>YFS</SubjectCode> </Subject> <Subject> <SubjectSchemeIdentifier>93</SubjectSchemeIdentifier> <SubjectCode>YNC</SubjectCode> </Subject> <Subject> <SubjectSchemeIdentifier>93</SubjectSchemeIdentifier> <SubjectCode>YXF</SubjectCode> </Subject> <AudienceCode>02</AudienceCode> <AudienceRange> <AudienceRangeQualifier>11</AudienceRangeQualifier> <AudienceRangePrecision>03</AudienceRangePrecision> <AudienceRangeValue>5</AudienceRangeValue> <AudienceRangePrecision>04</AudienceRangePrecision> <AudienceRangeValue>7</AudienceRangeValue> </AudienceRange> <AudienceRange> <AudienceRangeQualifier>17</AudienceRangeQualifier> <AudienceRangePrecision>03</AudienceRangePrecision> <AudienceRangeValue>8</AudienceRangeValue> <AudienceRangePrecision>04</AudienceRangePrecision> <AudienceRangeValue>12</AudienceRangeValue> </AudienceRange> <OtherText> <TextTypeCode>03</TextTypeCode> <Text textformat=\"02\"><p><strong>In this spellbinding and \"well-orchestrated\"* sequel to <em>The Mystwick School of Musicraft</em>, Amelia must master the magic of Composing to help her school win a magic competition--and save her friends from a mysterious evil.</strong></p><p>Things are finally looking up for Amelia Jones: she's officially a Mystwick student, and she even has a teacher to help her learn how to use her rare Composing magic. When Mystwick enters an international magic competition, it's Amelia's chance to Compose something that will help them win the day.</p><p>The only problem is that she still doesn't understand how her powers work. But then she hears about a super exclusive Midnight Orchestra--half performance, half magical black market--and Amelia is sure that's where she'll find the answer to her Composing problem.</p><p>But the Midnight Orchestra is far more sinister than it initially appears and if Amelia can't unlock her Composing powers, not only will Mystwick lose the musicraft competition, she won't be able to rescue her friends from the danger unleashed in this thrilling adventure.</p><p>*<em>Kirkus</em></p></Text> </OtherText> <OtherText> <TextTypeCode>08</TextTypeCode> <Text textformat=\"02\"><p>\"A well-orchestrated fantasy that will have readers asking for an encore.\" -- <strong><em>Kirkus Reviews</em></strong></p></Text> </OtherText> <OtherText> <TextTypeCode>99</TextTypeCode> <Text>US</Text> </OtherText> <MediaFile> <MediaFileTypeCode>04</MediaFileTypeCode> <MediaFileFormatCode>03</MediaFileFormatCode> <MediaFileLinkTypeCode>01</MediaFileLinkTypeCode> <MediaFileLink>https://image-hub-cloud.lightningsource.com/2011-04-01/Images/front_cover/x/sku/0063308886.jpg</MediaFileLink> </MediaFile> <Imprint> <NameCodeType>02</NameCodeType> <NameCodeTypeName>INGRAM PROPRIETARY</NameCodeTypeName> <NameCodeValue>CLAR</NameCodeValue> </Imprint> <Imprint> <ImprintName>Clarion Books</ImprintName> </Imprint> <Publisher> <PublishingRole>01</PublishingRole> <PublisherName>HarperCollins</PublisherName> </Publisher> <PublishingStatus datestamp=\"20230320\">02</PublishingStatus> <PublicationDate>20231219</PublicationDate> <SalesRights> <SalesRightsType>02</SalesRightsType> <RightsCountry>AD AE AF AG AI AL AM AO AQ AR AS AT AU AW AX AZ BA BB BD BE BF BG BH BI BJ BL BM BN BO BQ BR BS BT BV BW BY BZ CA CC CD CF CG CH CI CK CL CM CN CO CR CU CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK FM FO FR GA GB GD GE GF GG GH GI GL GM GN GP GQ GR GS GT GU GW GY HK HM HN HR HT HU ID IE IL IM IN IO IQ IR IS IT JE JM JO JP KE KG KH KI KM KN KP KR KW KY KZ LA LB LC LI LK LR LS LT LU LV LY MA MC MD ME MF MG MH MK ML MM MN MO MP MQ MR MS MT MU MV MW MX MY MZ NA NC NE NF NG NI NL NO NP NR NU NZ OM PA PE PF PG PH PK PL PM PN PR PS PT PW PY QA RE RO RS RU RW SA SB SC SD SE SG SH SI SJ SK SL SM SN SO SR SS ST SV SX SY SZ TC TD TF TG TH TJ TK TL TM TN TO TR TT TV TW TZ UA UG UM US UY UZ VA VC VE VG VI VN VU WF WS YE YT ZA ZM ZW</RightsCountry> </SalesRights> <Measure> <MeasureTypeCode>01</MeasureTypeCode> <Measurement>7.62</Measurement> <MeasureUnitCode>in</MeasureUnitCode> </Measure> <Measure> <MeasureTypeCode>02</MeasureTypeCode> <Measurement>5.12</Measurement> <MeasureUnitCode>in</MeasureUnitCode> </Measure> <Measure> <MeasureTypeCode>03</MeasureTypeCode> <Measurement>0.00</Measurement> <MeasureUnitCode>in</MeasureUnitCode> </Measure> <Measure> <MeasureTypeCode>08</MeasureTypeCode> <Measurement>1.0000</Measurement> <MeasureUnitCode>lb</MeasureUnitCode> </Measure> <RelatedProduct> <RelationCode>06</RelationCode> <ProductIdentifier> <ProductIDType>03</ProductIDType> <IDValue>9780358612919</IDValue> </ProductIdentifier> <ProductForm>BB</ProductForm> </RelatedProduct> <RelatedProduct> <RelationCode>00</RelationCode> <ProductIdentifier> <ProductIDType>03</ProductIDType> <IDValue>9780358665960</IDValue> </ProductIdentifier> <ProductForm>DG</ProductForm> </RelatedProduct> <RelatedProduct> <RelationCode>00</RelationCode> <ProductIdentifier> <ProductIDType>03</ProductIDType> <IDValue>9798400104879</IDValue> </ProductIdentifier> <ProductForm>AC</ProductForm> </RelatedProduct> <SupplyDetail> <SupplierName>Ingram Book Company</SupplierName> <SupplierRole>04</SupplierRole> <ReturnsCodeType>02</ReturnsCodeType> <ReturnsCode>Y</ReturnsCode> <ProductAvailability>10</ProductAvailability> <OnSaleDate>20231219</OnSaleDate> <PackQuantity>56</PackQuantity> <Price> <PriceTypeCode>01</PriceTypeCode> <DiscountCoded> <DiscountCodeType>02</DiscountCodeType> <DiscountCodeTypeName>INGRAM PROPRIETARY</DiscountCodeTypeName> <DiscountCode>7</DiscountCode> </DiscountCoded> <PriceAmount>12.50</PriceAmount> <CurrencyCode>CAD</CurrencyCode> <CountryCode>CA</CountryCode> </Price> <Price> <PriceTypeCode>01</PriceTypeCode> <DiscountCoded> <DiscountCodeType>02</DiscountCodeType> <DiscountCodeTypeName>INGRAM PROPRIETARY</DiscountCodeTypeName> <DiscountCode>7</DiscountCode> </DiscountCoded> <PriceAmount>9.99</PriceAmount> <CurrencyCode>USD</CurrencyCode> <CountryCode>US</CountryCode> </Price> </SupplyDetail> </Product> </ONIXMessage> </MsgPayload> </TIMSProductMessage>",
                            "xsdData": "<?xml version=\"1.0\" encoding=\"UTF-8\"?> <xs:schema xmlns:xs=\"http://www.w3.org/2001/XMLSchema\" xmlns:ns0=\"http://www.editeur.org/onix/2.1/reference\" elementFormDefault=\"qualified\" attributeFormDefault=\"unqualified\"> <xs:import namespace=\"http://www.editeur.org/onix/2.1/reference\" schemaLocation=\"ONIX_BookProduct_Release2.1_reference.xsd\"/> <xs:element name=\"TIMSProductMessage\"> <xs:annotation> <xs:documentation>TIMS Product XML Message </xs:documentation> <xs:documentation>Includes ONIX product 2.1 reference tag version and TIMS product file extract header</xs:documentation> </xs:annotation> <xs:complexType> <xs:sequence> <xs:element ref=\"MsgHeader\" minOccurs=\"0\"/> <xs:element ref=\"MsgPayload\" minOccurs=\"0\"/> </xs:sequence> </xs:complexType> </xs:element> <xs:element name=\"MsgHeader\"> <xs:complexType> <xs:sequence> <xs:element name=\"SenderName\" type=\"xs:string\" minOccurs=\"0\"/> <xs:element name=\"FileName\" type=\"xs:string\" minOccurs=\"0\"/> <xs:element name=\"DateTimeStamp\" type=\"xs:long\" minOccurs=\"0\"/> <xs:element name=\"TitleID\" type=\"xs:string\" minOccurs=\"0\"/> </xs:sequence> </xs:complexType> </xs:element> <xs:element name=\"MsgPayload\"> <xs:complexType> <xs:sequence> <xs:element name=\"ONIXMessage\" minOccurs=\"0\"/> </xs:sequence> </xs:complexType> </xs:element> </xs:schema>"
                        }
                    },
                    "out-identifier": "deRequest",
                    "return-object": true
                }
            },
            {
                "fire-all-rules": {}
            }
        ],
        "lookup": null
    }

# Response Payload:
   {
    "type": "SUCCESS",
    "msg": "Container xml-validator_1.0.0 successfully called.",
    "result": {
        "execution-results": {
            "results": [
                {
                    "value": {
                        "com.ingramcontent.model.XMLRequest": {
                            "xmlData": "
                                <?xml version=\"1.0\" encoding=\"utf-8\"?>
                                <TIMSProductMessage>
                                    <MsgHeader>
                                        <SenderName>TIMS</SenderName>
                                        <FileName>N/A</FileName>
                                        <DateTimeStamp>1234</DateTimeStamp>
                                        <TitleID>082671330</TitleID>
                                    </MsgHeader>
                                    <MsgPayload>
                                        <ONIXMessage>
                                            <Header>
                                                <FromCompany>Ingram Book Company</FromCompany>
                                                <FromPerson>Andy Stone</FromPerson>
                                                <FromEmail>andy.stone@ingramcontent.com</FromEmail>
                                                <SentDate>20230718</SentDate>
                                                <DefaultLanguageOfText>eng</DefaultLanguageOfText>
                                                <DefaultPriceTypeCode>01</DefaultPriceTypeCode>
                                                <DefaultCurrencyCode>USD</DefaultCurrencyCode>
                                            </Header>
                                            <Product>
                                                <RecordReference>082671330</RecordReference>
                                                <NotificationType>03</NotificationType>
                                                <ProductIdentifier>
                                                    <ProductIDType>02</ProductIDType>
                                                    <IDValue>0063308886</IDValue>
                                                </ProductIdentifier>
                                                <ProductIdentifier>
                                                    <ProductIDType>03</ProductIDType>
                                                    <IDValue>9780063308886</IDValue>
                                                </ProductIdentifier>
                                                <ProductIdentifier>
                                                    <ProductIDType>14</ProductIDType>
                                                    <IDValue>09780063308886</IDValue>
                                                </ProductIdentifier>
                                                <ProductIdentifier>
                                                    <ProductIDType>15</ProductIDType>
                                                    <IDValue>9780063308886</IDValue>
                                                </ProductIdentifier>
                                                <ProductForm>BC</ProductForm>
                                                <ProductFormDetail>B102</ProductFormDetail>
                                                <ProductFormDetail>B305</ProductFormDetail>
                                                <ProductClassification>
                                                    <ProductClassificationType>01</ProductClassificationType>
                                                    <ProductClassificationCode>4901.99.0075</ProductClassificationCode>
                                                </ProductClassification>
                                                <Series>
                                                    <TitleOfSeries>A Mystwick School Novel</TitleOfSeries>
                                                </Series>
                                                <Title textcase=\"02\" language=\"eng\">
                                                    <TitleType>01</TitleType>
                                                    <TitleText>The Midnight Orchestra</TitleText>
                                                    <TitlePrefix>The</TitlePrefix>
                                                    <TitleWithoutPrefix>Midnight Orchestra</TitleWithoutPrefix>
                                                </Title>
                                                <WorkIdentifier>
                                                    <WorkIDType>01</WorkIDType>
                                                    <IDTypeName>Ingram Family ID</IDTypeName>
                                                    <IDValue>009611485</IDValue>
                                                </WorkIdentifier>
                                                <Contributor>
                                                    <ContributorRole>A01</ContributorRole>
                                                    <NamesBeforeKey>Jessica</NamesBeforeKey>
                                                    <KeyNames>Khoury</KeyNames>
                                                    <BiographicalNote>
                                                        <p>
                                                            <strong>Jessica Khoury </strong>is the author of multiple books for teens and young readers. In addition to writing, she is an artistic mapmaker and spends far too much time scribbling tiny mountains and trees for fictional worlds. Her spare hours are spent video gaming, painting, or cooking badly. She lives in Greenville, South Carolina, with her husband, daughters, and sassy husky Katara.
                                                        </p>
                                                    </BiographicalNote>
                                                </Contributor>
                                                <Language>
                                                    <LanguageRole>01</LanguageRole>
                                                    <LanguageCode>eng</LanguageCode>
                                                </Language>
                                                <NumberOfPages>400</NumberOfPages>
                                                <BASICMainSubject>JUV037000</BASICMainSubject>
                                                <MainSubject>
                                                    <MainSubjectSchemeIdentifier>10</MainSubjectSchemeIdentifier>
                                                    <SubjectCode>JUV037000</SubjectCode>
                                                    <SubjectHeadingText>Juvenile Fiction/Fantasy and Magic</SubjectHeadingText>
                                                </MainSubject>
                                                <Subject>
                                                    <SubjectSchemeIdentifier>10</SubjectSchemeIdentifier>
                                                    <SubjectCode>JUV031040</SubjectCode>
                                                    <SubjectHeadingText>Juvenile Fiction/Performing Arts - Music</SubjectHeadingText>
                                                </Subject>
                                                <Subject>
                                                    <SubjectSchemeIdentifier>10</SubjectSchemeIdentifier>
                                                    <SubjectCode>JUV039060</SubjectCode>
                                                    <SubjectHeadingText>Juvenile Fiction/Social Themes - Friendship</SubjectHeadingText>
                                                </Subject>
                                                <Subject>
                                                    <SubjectSchemeIdentifier>10</SubjectSchemeIdentifier>
                                                    <SubjectCode>JUV035000</SubjectCode>
                                                    <SubjectHeadingText>Juvenile Fiction/School and Education</SubjectHeadingText>
                                                </Subject>
                                                <Subject>
                                                    <SubjectSchemeIdentifier>10</SubjectSchemeIdentifier>
                                                    <SubjectCode>JUV013060</SubjectCode>
                                                    <SubjectHeadingText>Juvenile Fiction/Family - Parents</SubjectHeadingText>
                                                </Subject>
                                                <Subject>
                                                    <SubjectSchemeIdentifier>20</SubjectSchemeIdentifier>
                                                    <SubjectHeadingText>fantasy; contemporary fantasy; fantasy adventure; fiction; fiction books for kids; fiction for boys; fiction for girls; fiction for kids; fiction for tweens; fiction for young boys; fiction for young girls; kids fiction; childrens fiction; middle grade fiction; boys fiction; girls fiction; introverts; back to school books for kids; school; books for kids; friendship books for kids; gifts for kids; gift books for kids; fun books for kids; magic; making friends; friends; gifts for new parents; friendship; friendship book; kindness; kindness books for children; bedtime stories; music; performing arts; books for girls ages 9 10 11 12; singing; musical instruments; musical; boys; books for boys ages 9 10 11 12; free; instruments; middle grade; books for middle grade readers; middle grade series; books for 10 year olds; books for 11 year olds; books for 12 year olds; books for reluctant readers; love; urban; youth; kids; 2022; series; teens; fathers day gifts; kids books; pregnancy gifts; 2022 books; children; 7 days in june; new parents gifts; ya; jessica; young adult; gift; 2023; girl; art; mystery; e books; making; new; kid; young; day; childrens; boy; supernatural; pregnancy; back; friend; child; story; middle school; tweens; mg; parent; favorites; introvert; bedtime; music books for kids; high fantasy; sci fi fantasy; children s; children s books; children s lit; science fiction fantasy; 5 star; fantasy paranormal; listened; listened to; 2022 releases; mother day gifts; mage; 2023 books; teen; middle grades; adventure; girl power; maybe; boarding school; free kids books; 9; 8; 10; books for 8 year old boys; books for 8 year old girls; kids books ages 8 9 10; 12; books for 12 year old boys; books for 12 year old girls; books for 10 year old boys; books for 11 year old boys; books for 9 year old girls; 11; books for 9 year old boys; books for 11 year old girls; tween books for girls ages 11 12 13 14; childrens books ages 8 9 10 11 12; books for 8 year olds; middle grade contemporary fantasy; books for middle grade girls; books for kids age 10 11 12; kids value books; middle school fiction</SubjectHeadingText>
                                                </Subject>
                                                <Subject>
                                                    <SubjectSchemeIdentifier>01</SubjectSchemeIdentifier>
                                                    <SubjectCode>FIC</SubjectCode>
                                                </Subject>
                                                <Subject>
                                                    <SubjectSchemeIdentifier>24</SubjectSchemeIdentifier>
                                                    <SubjectSchemeName>INGRAM SUBJECT</SubjectSchemeName>
                                                    <SubjectCode>CJ</SubjectCode>
                                                    <SubjectHeadingText>Children's Books/Ages 9/12 Fiction</SubjectHeadingText>
                                                </Subject>
                                                <Subject>
                                                    <SubjectSchemeIdentifier>24</SubjectSchemeIdentifier>
                                                    <SubjectSchemeName>INGRAM THEME</SubjectSchemeName>
                                                    <SubjectCode>TOPC/FAMILY</SubjectCode>
                                                    <SubjectHeadingText>Topical/Family</SubjectHeadingText>
                                                </Subject>
                                                <Subject>
                                                    <SubjectSchemeIdentifier>24</SubjectSchemeIdentifier>
                                                    <SubjectSchemeName>INGRAM THEME</SubjectSchemeName>
                                                    <SubjectCode>TOPC/FRIEND</SubjectCode>
                                                    <SubjectHeadingText>Topical/Friendship</SubjectHeadingText>
                                                </Subject>
                                                <Subject>
                                                    <SubjectSchemeIdentifier>24</SubjectSchemeIdentifier>
                                                    <SubjectSchemeName>INGRAM THEME</SubjectSchemeName>
                                                    <SubjectCode>TOPC/GIRLIN</SubjectCode>
                                                    <SubjectHeadingText>Topical/Girl's Interest</SubjectHeadingText>
                                                </Subject>
                                                <Subject>
                                                    <SubjectSchemeIdentifier>22</SubjectSchemeIdentifier>
                                                    <SubjectCode>TP058</SubjectCode>
                                                </Subject>
                                                <Subject>
                                                    <SubjectSchemeIdentifier>93</SubjectSchemeIdentifier>
                                                    <SubjectCode>YFB</SubjectCode>
                                                </Subject>
                                                <Subject>
                                                    <SubjectSchemeIdentifier>93</SubjectSchemeIdentifier>
                                                    <SubjectCode>YFH</SubjectCode>
                                                </Subject>
                                                <Subject>
                                                    <SubjectSchemeIdentifier>93</SubjectSchemeIdentifier>
                                                    <SubjectCode>YFN</SubjectCode>
                                                </Subject>
                                                <Subject>
                                                    <SubjectSchemeIdentifier>93</SubjectSchemeIdentifier>
                                                    <SubjectCode>YFS</SubjectCode>
                                                </Subject>
                                                <Subject>
                                                    <SubjectSchemeIdentifier>93</SubjectSchemeIdentifier>
                                                    <SubjectCode>YNC</SubjectCode>
                                                </Subject>
                                                <Subject>
                                                    <SubjectSchemeIdentifier>93</SubjectSchemeIdentifier>
                                                    <SubjectCode>YXF</SubjectCode>
                                                </Subject>
                                                <AudienceCode>02</AudienceCode>
                                                <AudienceRange>
                                                    <AudienceRangeQualifier>11</AudienceRangeQualifier>
                                                    <AudienceRangePrecision>03</AudienceRangePrecision>
                                                    <AudienceRangeValue>5</AudienceRangeValue>
                                                    <AudienceRangePrecision>04</AudienceRangePrecision>
                                                    <AudienceRangeValue>7</AudienceRangeValue>
                                                </AudienceRange>
                                                <AudienceRange>
                                                    <AudienceRangeQualifier>17</AudienceRangeQualifier>
                                                    <AudienceRangePrecision>03</AudienceRangePrecision>
                                                    <AudienceRangeValue>8</AudienceRangeValue>
                                                    <AudienceRangePrecision>04</AudienceRangePrecision>
                                                    <AudienceRangeValue>12</AudienceRangeValue>
                                                </AudienceRange>
                                                <OtherText>
                                                    <TextTypeCode>03</TextTypeCode>
                                                    <Text textformat=\"02\">
                                                        <p>
                                                            <strong>In this spellbinding and \"well-orchestrated\"* sequel to 
                                                                <em>The Mystwick School of Musicraft</em>, Amelia must master the magic of Composing to help her school win a magic competition--and save her friends from a mysterious evil.
                                                            </strong>
                                                        </p>
                                                        <p>Things are finally looking up for Amelia Jones: she's officially a Mystwick student, and she even has a teacher to help her learn how to use her rare Composing magic. When Mystwick enters an international magic competition, it's Amelia's chance to Compose something that will help them win the day.</p>
                                                        <p>The only problem is that she still doesn't understand how her powers work. But then she hears about a super exclusive Midnight Orchestra--half performance, half magical black market--and Amelia is sure that's where she'll find the answer to her Composing problem.</p>
                                                        <p>But the Midnight Orchestra is far more sinister than it initially appears and if Amelia can't unlock her Composing powers, not only will Mystwick lose the musicraft competition, she won't be able to rescue her friends from the danger unleashed in this thrilling adventure.</p>
                                                        <p>*
                                                            <em>Kirkus</em>
                                                        </p>
                                                    </Text>
                                                </OtherText>
                                                <OtherText>
                                                    <TextTypeCode>08</TextTypeCode>
                                                    <Text textformat=\"02\">
                                                        <p>\"A well-orchestrated fantasy that will have readers asking for an encore.\" -- 
                                                            <strong>
                                                                <em>Kirkus Reviews</em>
                                                            </strong>
                                                        </p>
                                                    </Text>
                                                </OtherText>
                                                <OtherText>
                                                    <TextTypeCode>99</TextTypeCode>
                                                    <Text>US</Text>
                                                </OtherText>
                                                <MediaFile>
                                                    <MediaFileTypeCode>04</MediaFileTypeCode>
                                                    <MediaFileFormatCode>03</MediaFileFormatCode>
                                                    <MediaFileLinkTypeCode>01</MediaFileLinkTypeCode>
                                                    <MediaFileLink>https: //image-hub-cloud.lightningsource.com/2011-04-01/Images/front_cover/x/sku/0063308886.jpg</MediaFileLink>
                                                </MediaFile>
                                                <Imprint>
                                                    <NameCodeType>02</NameCodeType>
                                                    <NameCodeTypeName>INGRAM PROPRIETARY</NameCodeTypeName>
                                                    <NameCodeValue>CLAR</NameCodeValue>
                                                </Imprint>
                                                <Imprint>
                                                    <ImprintName>Clarion Books</ImprintName>
                                                </Imprint>
                                                <Publisher>
                                                    <PublishingRole>01</PublishingRole>
                                                    <PublisherName>HarperCollins</PublisherName>
                                                </Publisher>
                                                <PublishingStatus datestamp=\"20230320\">02</PublishingStatus>
                                                <PublicationDate>20231219</PublicationDate>
                                                <SalesRights>
                                                    <SalesRightsType>02</SalesRightsType>
                                                    <RightsCountry>AD AE AF AG AI AL AM AO AQ AR AS AT AU AW AX AZ BA BB BD BE BF BG BH BI BJ BL BM BN BO BQ BR BS BT BV BW BY BZ CA CC CD CF CG CH CI CK CL CM CN CO CR CU CV CW CX CY CZ DE DJ DK DM DO DZ EC EE EG EH ER ES ET FI FJ FK FM FO FR GA GB GD GE GF GG GH GI GL GM GN GP GQ GR GS GT GU GW GY HK HM HN HR HT HU ID IE IL IM IN IO IQ IR IS IT JE JM JO JP KE KG KH KI KM KN KP KR KW KY KZ LA LB LC LI LK LR LS LT LU LV LY MA MC MD ME MF MG MH MK ML MM MN MO MP MQ MR MS MT MU MV MW MX MY MZ NA NC NE NF NG NI NL NO NP NR NU NZ OM PA PE PF PG PH PK PL PM PN PR PS PT PW PY QA RE RO RS RU RW SA SB SC SD SE SG SH SI SJ SK SL SM SN SO SR SS ST SV SX SY SZ TC TD TF TG TH TJ TK TL TM TN TO TR TT TV TW TZ UA UG UM US UY UZ VA VC VE VG VI VN VU WF WS YE YT ZA ZM ZW</RightsCountry>
                                                </SalesRights>
                                                <Measure>
                                                    <MeasureTypeCode>01</MeasureTypeCode>
                                                    <Measurement>7.62</Measurement>
                                                    <MeasureUnitCode>in</MeasureUnitCode>
                                                </Measure>
                                                <Measure>
                                                    <MeasureTypeCode>02</MeasureTypeCode>
                                                    <Measurement>5.12</Measurement>
                                                    <MeasureUnitCode>in</MeasureUnitCode>
                                                </Measure>
                                                <Measure>
                                                    <MeasureTypeCode>03</MeasureTypeCode>
                                                    <Measurement>0.00</Measurement>
                                                    <MeasureUnitCode>in</MeasureUnitCode>
                                                </Measure>
                                                <Measure>
                                                    <MeasureTypeCode>08</MeasureTypeCode>
                                                    <Measurement>1.0000</Measurement>
                                                    <MeasureUnitCode>lb</MeasureUnitCode>
                                                </Measure>
                                                <RelatedProduct>
                                                    <RelationCode>06</RelationCode>
                                                    <ProductIdentifier>
                                                        <ProductIDType>03</ProductIDType>
                                                        <IDValue>9780358612919</IDValue>
                                                    </ProductIdentifier>
                                                    <ProductForm>BB</ProductForm>
                                                </RelatedProduct>
                                                <RelatedProduct>
                                                    <RelationCode>00</RelationCode>
                                                    <ProductIdentifier>
                                                        <ProductIDType>03</ProductIDType>
                                                        <IDValue>9780358665960</IDValue>
                                                    </ProductIdentifier>
                                                    <ProductForm>DG</ProductForm>
                                                </RelatedProduct>
                                                <RelatedProduct>
                                                    <RelationCode>00</RelationCode>
                                                    <ProductIdentifier>
                                                        <ProductIDType>03</ProductIDType>
                                                        <IDValue>9798400104879</IDValue>
                                                    </ProductIdentifier>
                                                    <ProductForm>AC</ProductForm>
                                                </RelatedProduct>
                                                <SupplyDetail>
                                                    <SupplierName>Ingram Book Company</SupplierName>
                                                    <SupplierRole>04</SupplierRole>
                                                    <ReturnsCodeType>02</ReturnsCodeType>
                                                    <ReturnsCode>Y</ReturnsCode>
                                                    <ProductAvailability>10</ProductAvailability>
                                                    <OnSaleDate>20231219</OnSaleDate>
                                                    <PackQuantity>56</PackQuantity>
                                                    <Price>
                                                        <PriceTypeCode>01</PriceTypeCode>
                                                        <DiscountCoded>
                                                            <DiscountCodeType>02</DiscountCodeType>
                                                            <DiscountCodeTypeName>INGRAM PROPRIETARY</DiscountCodeTypeName>
                                                            <DiscountCode>7</DiscountCode>
                                                        </DiscountCoded>
                                                        <PriceAmount>12.50</PriceAmount>
                                                        <CurrencyCode>CAD</CurrencyCode>
                                                        <CountryCode>CA</CountryCode>
                                                    </Price>
                                                    <Price>
                                                        <PriceTypeCode>01</PriceTypeCode>
                                                        <DiscountCoded>
                                                            <DiscountCodeType>02</DiscountCodeType>
                                                            <DiscountCodeTypeName>INGRAM PROPRIETARY</DiscountCodeTypeName>
                                                            <DiscountCode>7</DiscountCode>
                                                        </DiscountCoded>
                                                        <PriceAmount>9.99</PriceAmount>
                                                        <CurrencyCode>USD</CurrencyCode>
                                                        <CountryCode>US</CountryCode>
                                                    </Price>
                                                </SupplyDetail>
                                            </Product>
                                        </ONIXMessage>
                                    </MsgPayload>
                                </TIMSProductMessage>",
                                "xsdData": "
                                <?xml version=\"1.0\" encoding=\"UTF-8\"?>
                                <xs:schema xmlns:xs=\"http://www.w3.org/2001/XMLSchema\" xmlns:ns0=\"http://www.editeur.org/onix/2.1/reference\" elementFormDefault=\"qualified\" attributeFormDefault=\"unqualified\">
                                    <xs:import namespace=\"http://www.editeur.org/onix/2.1/reference\" schemaLocation=\"ONIX_BookProduct_Release2.1_reference.xsd\"/>
                                    <xs:element name=\"TIMSProductMessage\">
                                        <xs:annotation>
                                            <xs:documentation>TIMS Product XML Message </xs:documentation>
                                            <xs:documentation>Includes ONIX product 2.1 reference tag version and TIMS product file extract header</xs:documentation>
                                        </xs:annotation>
                                        <xs:complexType>
                                            <xs:sequence>
                                                <xs:element ref=\"MsgHeader\" minOccurs=\"0\"/>
                                                <xs:element ref=\"MsgPayload\" minOccurs=\"0\"/>
                                            </xs:sequence>
                                        </xs:complexType>
                                    </xs:element>
                                    <xs:element name=\"MsgHeader\">
                                        <xs:complexType>
                                            <xs:sequence>
                                                <xs:element name=\"SenderName\" type=\"xs:string\" minOccurs=\"0\"/>
                                                <xs:element name=\"FileName\" type=\"xs:string\" minOccurs=\"0\"/>
                                                <xs:element name=\"DateTimeStamp\" type=\"xs:long\" minOccurs=\"0\"/>
                                                <xs:element name=\"TitleID\" type=\"xs:string\" minOccurs=\"0\"/>
                                            </xs:sequence>
                                        </xs:complexType>
                                    </xs:element>
                                    <xs:element name=\"MsgPayload\">
                                        <xs:complexType>
                                            <xs:sequence>
                                                <xs:element name=\"ONIXMessage\" minOccurs=\"0\"/>
                                            </xs:sequence>
                                        </xs:complexType>
                                    </xs:element>
                                </xs:schema>",
                                "validXML": true,
                                                            "errorMessage": null
                                                        }
                                                    },
                                                    "key": "deRequest"
                                                }
                                            ],
                                            "facts": [
                                                {
                                                    "value": {
                                                        "org.drools.core.common.DefaultFactHandle": {
                                                            "external-form": "0:135:1528006886:1528006886:135:DEFAULT:NON_TRAIT:com.ingramcontent.model.XMLRequest"
                                                        }
                                                    },
                                                    "key": "deRequest"
                                                }
                                            ]
                                        }
                                    }
                                }