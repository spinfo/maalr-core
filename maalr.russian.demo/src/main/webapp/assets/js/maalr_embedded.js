var maalr_headerData = '<div class="maalr_header"><div class="maalr_header_text">Search with Maalr</div></div>';
var maalr_footerData = '<div class="maalr_footer"><div class="maalr_footer_text"><a class="maalr_footer_link" href="localhost:8080">localhost:8080</a><span class="maalr_cr">&copy; Sprachliche Informationsverarbeitung (Universität zu Köln)</span></div></div>';

var maalr_script = document.createElement('script');
maalr_script.src = document.getElementById("maalr_query_div").getAttribute("data-source") + "/assets/js/maalr_embedded.js";
document.head.appendChild(maalr_script);