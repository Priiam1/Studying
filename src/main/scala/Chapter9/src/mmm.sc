//<img.+src\s*=\s*"(.+?)"
val Pattern = "<img.*src=\"(.*)\".*>".r
val exampleText = """<img width="1" height="1" style="display: none;" src="https://t.mookie1.com/rsp?dnv=[TIMESTAMP]&amp;rurl=//ib.adnxs.com/mapuid?member=364%26user=[MOOKIE]">"""
//val exampleText = """<img src="https://t.mookie1.com/rsp?dnv=[TIMESTAMP]&amp;rurl=//ib.adnxs.com/mapuid?member=364%26user=[MOOKIE]">"""

exampleText match {
  case Pattern(text)=>
    text
  case _ =>
    ""
}