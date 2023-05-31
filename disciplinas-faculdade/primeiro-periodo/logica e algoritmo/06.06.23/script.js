function returnAmountToPay (hour, min){  
    let secondHour = 2;
    let thirdHour = 3;
    let fifthHour = 5;

    let delay = hour - 4

    let additionalValue = 2;
    let firstToSecond = 8
    let thirdToFourth = 8.5

    if (hour <= secondHour){
        if (hour == 2 && min > 0){
            return thirdToFourth
        } else {
            return firstToSecond
        }
    }

    if (hour >= thirdHour && hour < fifthHour){
        if (hour == 4 && min > 0){
            return thirdToFourth + additionalValue
        } else {
            return thirdToFourth
        }
    }

    if (hour >= fifthHour){
        if (min > 0){
            return delay * additionalValue + thirdToFourth + additionalValue
        } else {
            return delay * additionalValue + thirdToFourth
        }
    }
}

console.log(returnAmountToPay(1,00)) // return 8
console.log(returnAmountToPay(1,40)) // return 8
console.log(returnAmountToPay(3,40)) // return 8.5
console.log(returnAmountToPay(4,40)) // return 10.5
console.log(returnAmountToPay(6,00)) // return 12.5