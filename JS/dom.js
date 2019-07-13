/* let name = document.getElementById('name');
console.log(name);
console.log(name.textContent);
name.style.color = 'pink';


var classCollection = document.getElementsByClassName('demo');
console.log(classCollection);
classCollection[0].style.fontSize = '20px';
classCollection[1].style.display = 'none';

//document.getElementById('myButton').className= 'button';
document.getElementById('myButton').classList= ' button button1';
document.getElementById('myButton1').classList= 'button';


var queryselect = document.querySelector('p');
console.log(queryselect)

var queryselectall = document.querySelectorAll('.demo');
console.log(queryselectall);

let input = document.createElement('input');
document.body.appendChild(input);

var demoClass = document.getElementsByClassName('demo');
console.log(demoClass.length);

var demoClass1 = document.querySelectorAll('.demo');
console.log("query selector "+demoClass1.length);

//write the no of elements in each array(value match)
console.log("no of elements with query selecty all= "+demoClass1.length);
console.log("no of elements with getElementsByClassName= "+demoClass.length);

//change one elements class to blue
document.getElementById("pele").className = "blue";

//write the no of elements in each array(value differ)
console.log("no of elements with query selecty all= "+demoClass1.length);
console.log("no of elements with getElementsByClassName= "+demoClass.length);

document.write()
 */

let button = document.getElementById('myButton');
/* 
button.onclick  =function createNewElement() {
    document.getElementById('div1').innerHTML = '<a href="https://www.google.com"> anchor tag </a>';
} */
window.onload = function(){
    document.getElementById('myButton').textContent = 'dont click';
};
button.addEventListener('click',()=>{
    document.getElementById('div1').innerHTML = '<a href="https://www.google.com"> anchor tag </a>';
})