function calcNumbers(result){
    form.displayResult.value=form.displayResult.value+result;
    
}

//when clear button is called
var clearAll = function() {
    oldNum = "";
    theNum = "";
    viewer.innerHTML = "0";
    equals.setAttribute("data-result", resultNum);
  };

  (function() {
  var el = function(element) {
    if (element.charAt(0) === "#") { // If passed an ID...
      return document.querySelector(element); // ... returns single element
    }

    return document.querySelectorAll(element); // Otherwise, returns a nodelist
  };
  // Add click event to clear button
  el("#clear").onclick = clearAll;
}());