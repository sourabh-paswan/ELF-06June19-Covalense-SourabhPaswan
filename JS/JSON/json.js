// var library=[
//     {
//         id: 1,
//         auther:'bill gates',
//         name: 'bill'
//     },
//     {
//        id: 2,
//        auther:'steve jobs',
//        name: 'steve'
//    },
//    {
//        id: 3,
//        auther:'narayna',
//        name: 'infosys'
//    },

//    ];



//    var jsonLibrary = JSON.stringify(library);
//    console.log(jsonLibrary);

//    var objLibrary = JSON.parse(jsonLibrary);
//    console.log(objLibrary);


// window.onload = function () {

// };
// var num = 4;
// var fact = 1;

// function fact(num) {
//     fact = fact(num - 1);
//     console.log(fact);
// };


// let num = prompt("ener num");
// console.log(factorial(num));

// function factorial(n){
//     if(n===0||n===1){
//         return 1;
//     }else{
//         return factorial(n-1)*n;
//     }
// }

// let count = counter();
// var value = count();
// console.log(value);

// var value1 = count();
// console.log(value1);

// function counter(){
//     var counter = 0;
//     function getcount(){
//         counter++;
//         return counter;

//     }
//     return getcount;
// }


// var dwightslary = (function(){
//     var salary = 60000;
//     function changeBy(amount){
//         salary += amount;
//     }


//     return{
//         raise: function(){
//             changeBy(500);
//         },
//         lower: function(){
//             changeBy(-500);
//         },
//         normal: function(){
//             return salary;
//         }
//     };
// })();


// dwightslary.lower();
// alert(dwightslary.lower());


let promise = new Promise((res,rej)=>{
    const items = [{id:1,name:'chandan'},{id:2,name:'ajay'}];
    if(items.length>0){
        res(items);
    }else{
        rej("rejected");
    }
});

let promise1 = new Promise((res,rej)=>{
    const items = [{id:1,name:'chandan'},{id:2,name:'ajay'}];
    if(items.length>0){
        res(items);
    }else{
        rej("rejected");
    }
});

let promise2 = new Promise((res,rej)=>{
    const items = [{id:1,name:'chandan'},{id:2,name:'ajay'}];
    if(items.length>0){
        res(items);
    }else{
        rej("rejected");
    }
});



promise.then((data)=>{
    console.log(data);
}).catch((reason)=>{
    console.log(reason);
});
  

Promise.all([promise,promise1,promise2]).then((data)=>{
    console.log(data);
})

Promise.race([promise,promise1,promise2]).then((data)=>{
    console.log(data);
})

