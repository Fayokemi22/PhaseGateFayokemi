function negativeArray(array){
for(let count=0; count<array.length; count++){
if(array[count]<0){
array[count]=0
}
return array
}
 
}



let array = [5,-9,3,-6,2,-11] 
console.log(negativeArray(array))
