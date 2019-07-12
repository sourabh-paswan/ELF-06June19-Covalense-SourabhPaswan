// var a= 10;
// console.log(a);
// var b= a;
// console.log(b);
// console.log(a);
// console.log(b);
// console.log("============================");
// var person ={
//     name : 'sourabh',
//     age : 25,
// };
// console.log("p name = "+ person.name);
// var person1 = person;
// console.log("p1 name = "+ person1.name);
// person1.name= 'sourabh paswan';
// console.log("p name = "+ person.name);
// console.log("p1 name = "+ person1.name);

// var person ={
//         firstname : 'sourabh',
//         lastname : 'paswan',
//         eyecolor: 'black',
//         age : 24,
//         getFullName: function(){
//             return this.firstname + " "+ this.lastname;

//         },

//         address:{
//             city : 'bangalore',
//             state: 'karnataka',
//             pincode:560029
//         },
//         hobbies :['sleeping','watching movies','roaming']

        
//  };
//  console.log("first name "+person.firstname);
//  console.log("city "+person.address.city.pincode);
//  console.log("full name "+person.getFullName());
//  console.log("hobbies "+person.hobbies);

//  var library=[
//      {
//          id: 1,
//          auther:'bill gates',
//          name: 'bill'
//      },
//      {
//         id: 2,
//         auther:'steve jobs',
//         name: 'steve'
//     },
//     {
//         id: 3,
//         auther:'narayna',
//         name: 'infosys'
//     },
    
//     ]

//     console.log("object1 "+library[0]);
//     console.log(new Date);
//     console.log(new Date(0))


    // var hobbies = ['sleeping','watching movies','roaming'];
    // document.getElementById("demo").innerHTML = hobbies;

    // var person ={
    //             firstname : 'sourabh',
    //             lastname : 'paswan',
    //             eyecolor: 'black',
    //             age : 24,
    //             getFullName: function(){
    //                 return this.firstname + " "+ this.lastname;
        
    //             },
        
    //             address:{
    //                 city : 'bangalore',
    //                 state: 'karnataka',
    //                 pincode:560029
    //             };
                
        
                
        

        //  for(var i=0;i<person.length;i++){
        //      console.log("value = "+person[i]);
        //  }

//          hobbies =['sleeping','watching movies','roaming'];
//          for(var i=0;i<hobbies.length;i++){
//             console.log("value = "+hobbies[i]);
//         }

//         console.log("=============================");

//         hobbies.forEach((val,index)=>{
// console.log("value "+val);
// console.log("index "+index);
//         })

//         console.log("=============================");

//         for(var val of hobbies){
//             console.log("hobbies "+val)
//         }
//         console.log("=============================");
//         for(var index in hobbies){
//             console.log("hobbies "+hobbies["5656"]);
//         }
//         console.log("=============================");
//         hobbies['test']='some value';
//         for(var index in hobbies){
//             console.log("hobbies "+hobbies[index]);
//         }
//         console.log("=============================");
//         for(var val of hobbies){
//             console.log("hobbies "+val)
//         }


// console.log("========for of loop========");
// console.time("forof");
// for(var i of hobbies){
//     var a=[];
// }
// console.timeEnd("forof");
// console.log("for of ended")

// console.log("========for in loop========");
// console.time("forin");
// for(var i in hobbies){
//     var a=[];
// }
// console.timeEnd("forin");
// console.log("for in ended")
// function alertMessage(){
//     alert("this is named funtion");
// }
// function alertMessage2(val,number){
//     alert(`this is named funtion value=${val} number=${number}`);
// }

// (function(){
//     alert("this is IIFE");
// }());

// (function(){
//     alert("this is IIFE2");
// })();
// alertMessage2 ("aa",12);
// varKey();
// function varKey(){
//     a=20;
//     console.log("aaa= "+a);
//     a=20;
// }
// console.log("aaa= "+a);



// function letKey(){
//     let a=20;
//     console.log("aaa= "+a);
// }
// console.log("aaa= "+a);

// function constKey(){
//     const a=20;
//     console.log("aaa= "+a);
// }
// console.log("aaa= "+a);

// fname();
// function fname(){
    
//     console.log("fname ");
    
// }




// var fname1=function(){
//     console.log("fname1 ");
// }
// fname1();
var a={};

var hobbies = ['sleeping','watching movies','roaming'];
// console.log(Array.isArray(hobbies));
// console.log(typeof hobbies);
// console.log(Array.isArray(a));

// var incl = hobbies.includes("cric");
// console.log(incl);

// hobbies.push("kabbaddi");
// console.log(hobbies);

// hobbies.pop("kabbaddi");
// console.log(hobbies);

// hobbies.shift();
// console.log(hobbies);

// hobbies.unshift("new value");
// console.log(hobbies);


// hobbies.splice(0,0,"new new","gggg");
// console.log(hobbies)

// let hob = hobbies.slice(0,3);
// console.log(hob)

// console.log(hobbies.join('==='));
// console.log(hobbies);

// console.log(hobbies.indexOf('sleeing'));

// call back function


// function first(sec){

//     setTimeout(()=>{
//         console.log("this is the first");
//         sec();
//     },4000);
    
// }

// function second(){
//     console.log("this is the second");
// }
// first(second);


const items = [
    {
        id : 1,
        name :  'book',
        price : 200

    },
    {
        id : 2,
        name :  'bag',
        price : 207870

    },
    {
        id : 3,
        name :  'shirt',
        price : 20780

    },
    {
        id : 4,
        name :  'lappy',
        price : 2012120

    }
];
console.log(items);


// let mappedIds = items.map((values)=>{
// return values.id;
// });

// console.log(mappedIds);

let filterValuue = items.filter((values)=>{
    return values.name==='shirt'&& values.id==3;
    });
    
    console.log(filterValuue);
