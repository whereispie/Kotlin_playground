class NewStaticCategoryV2 {
    var allNodes = mutableMapOf(
        "experienceIcon1" to "",
        "experienceIcon2" to "",
        "experienceIcon3" to "",

        "skillIcon1" to "",
        "skillIcon2" to "",
        "skillIcon3" to "",

        "mobileSkillIcon1" to "",
        "mobileSkillIcon2" to "",
        "mobileSkillIcon3" to "",

        "mobileTargetingItemIcon1" to "",
        "mobileTargetingItemIcon2" to "",
        "mobileTargetingItemIcon3" to "",

        "targetingItemIcon1" to "",
        "targetingItemIcon2" to "",
        "targetingItemIcon3" to "",
       )

    private fun <K, V> Map<K, V>.toMutableCopy() = HashMap(this)

    private fun addValuesToMap(map: Map<String, String>): HashMap<String, String> {
        val mutableMap = allNodes.toMutableCopy()
        mutableMap.putAll(map)
        return mutableMap
    }

    enum class Type {
        CATEGORY_STATIC
    }

    var mapWithDataMMEO = mapOf("skillIcon1" to "सक्रिय बिक्री",
        "skillIcon2" to "आपत्तियों से निपटना",
        "skillIcon3" to "प्रोडक्ट का इफेक्टिव प्रजेंटेशन",
        "targetingItemIcon1" to "बिक्री करना सीखें",
        "targetingItemIcon2" to "सेल्स मैनेजर्स",
        "targetingItemIcon3" to "बिजनेस की लाभप्रदता में वृद्धि")
    var mapWithDataBZPT = mapOf("skillIcon1" to "SEO अनुकूलन",
        "skillIcon2" to "",
        "skillIcon3" to "इंटरनेट एडवरटाइजिंग",
        "targetingItemIcon1" to "शून्य से इंटरनेट-मार्केटिंग",
        "targetingItemIcon2" to "SMM",
        "targetingItemIcon3" to "सर्च इंजन प्रोमोशन")
    var mapWithDataVXDK = mapOf("skillIcon1" to "टीम मैनेजमेंट",
        "skillIcon2" to "मूल्य निर्धारण",
        "skillIcon3" to "आय में वृद्धि",
        "targetingItemIcon1" to "शून्य से बिजनेस शुरू करना",
        "targetingItemIcon2" to "बिजनेस टूल्स",
        "targetingItemIcon3" to "बिजनेस स्ट्रेटजी")
    var mapWithDataPCYU = mapOf("skillIcon1" to "टीम मैनेजमेंट",
        "skillIcon2" to "MLM सेल्स फनल",
        "skillIcon3" to "नए पार्टनर्स को आकर्षित करना",
        "targetingItemIcon1" to "शून्य से MLM",
        "targetingItemIcon2" to "नेटवर्क मार्केटिंग लिडर",
        "targetingItemIcon3" to "नेटवर्क मार्केटिंग की जानकारी")
    var mapWithDataYXYP = mapOf("skillIcon1" to "कम्युनिकेशन स्किल्स",
        "skillIcon2" to "इमोशन मैनेजमेंट",
        "skillIcon3" to "टाइम मैनेजमेंट",
        "targetingItemIcon1" to "टीम प्रोडक्टिविटी",
        "targetingItemIcon2" to "विवाद निवारण",
        "targetingItemIcon3" to "पब्लिक स्पीकिंग")
    var mapWithDataURVJ = mapOf("skillIcon1" to "फाइनेंसियल प्लानिंग",
        "skillIcon2" to "मूल्य निर्धारण",
        "skillIcon3" to "निवेश",
        "targetingItemIcon1" to "बजट",
        "targetingItemIcon2" to "किशोरों के लिए वित्तीय साक्षरता",
        "targetingItemIcon3" to "निवेश")
    var mapWithDataCOBI = mapOf("skillIcon1" to "कैरियर के विकल्प",
        "skillIcon2" to "नई विशेषता",
        "skillIcon3" to "विदेश में काम",
        "targetingItemIcon1" to "छात्रों के लिए कैरियर का विकास",
        "targetingItemIcon2" to "50 के बाद कैरियर",
        "targetingItemIcon3" to "नया कैरियर बनाना")
    var mapWithDataACCV = mapOf("skillIcon1" to "महिलाओं के लिए टाइम-मैनेजमेंट",
        "skillIcon2" to "काम और घर",
        "skillIcon3" to "मातृत्व अवकाश पर काम",
        "targetingItemIcon1" to "गृहिणियों के लिए काम",
        "targetingItemIcon2" to "महिला लिडर",
        "targetingItemIcon3" to "महिलाओं के लिए कोर्स")
    var mapWithDataLHIT = mapOf("skillIcon1" to "सेल्फ-आईडेंटिफिकेशन",
        "skillIcon2" to "किशोरों के लिए कोर्स",
        "skillIcon3" to "किशोरों के लिए ट्रेनिंग",
        "targetingItemIcon1" to "किशोरों के लिए ऑनलाइन-कोर्स",
        "targetingItemIcon2" to "माता-पिता के लिए कोर्स",
        "targetingItemIcon3" to "शिक्षकों के लिए कोर्स")
    var mapWithDataBLCL = mapOf("skillIcon1" to "सफलता",
        "skillIcon2" to "शून्य से बिजनेस शुरू करना",
        "skillIcon3" to "टीम का निर्माण",
        "targetingItemIcon1" to "लीडरशिप",
        "targetingItemIcon2" to "बिजनेस का विकास",
        "targetingItemIcon3" to "कैरियर का विकास")
    var mapWithDataXCWI = mapOf("skillIcon1" to "करियर विकास के लिए फ्री कोर्स",
        "skillIcon2" to "नए फ्री कोर्स",
        "skillIcon3" to "soft skills के फ्री कोर्स",
        "targetingItemIcon1" to "फ्री लीडरशिप कोर्स",
        "targetingItemIcon2" to "फ्री बिज़नेस कोर्स",
        "targetingItemIcon3" to "फ्री व्यावसायिक कोर्स")

    companion object {
        var sales = "sales"
        var `digital-marketing` = "digital-marketing"
        var business = "business"
        var `network-marketing` = "network-marketing"
        var `soft-skills` = "soft-skills"
        var `financial-literacy` = "financial-literacy"
        var `career-development` = "career-development"
        var `female-leadership` = "female-leadership"
        var teens = "teens"
        var `money-education` = "money-education"
        var `free-courses` = "free-courses"
    }


    fun createQueries() {
        printQueries(allNodes)
    }

    private fun printQueries(code: MutableMap<String, String>) {
        code.forEach { node ->
            var isItNull = ""
            if (node.value.isBlank()) {
                isItNull = "NULL"
            } else {
                isItNull = "'" + node.value + "'"
            }

            val query = """
    <sql>
    UPDATE lectera_static.lectera.static_content
    SET content = jsonb_set(content, '{${node.key}}', json_build_object('src', content -> '${node.key}', 'alt', ${isItNull})::jsonb)
    WHERE type = '${Type.CATEGORY_STATIC.name}';
    </sql>"""
            println(query)
        }
    }

}

fun main() {
    val v2 = NewStaticCategoryV2()
    v2.createQueries()
}