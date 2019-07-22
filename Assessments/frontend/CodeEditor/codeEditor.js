const first = document.querySelector(".first");
const iframe = document.querySelector("iframe");
const btn = document.querySelector("button");


//code will ve written in text format with html tags
btn.addEventListener("click", () => {
    var html = first.textContent;
    iframe.src = "data:text/html;charset=utf-8," + encodeURI(html);
});

//code will be treated as html and reprents in browsers
first.addEventListener("paste", function (e) {
    e.preventDefault();
    var text = e.clipboardData.getData("text/plain");
    document.execCommand("insertText", false, text);
});