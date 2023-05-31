function amountToPay (hour, min){  
    let firstPeriod = 2, secondPeriod = 4, thirdPeriod = 5;

    let delay = hour - 4
    let additionalValue = 2, firstValue = 8, secondValue = 8.5

    if (hour <= firstPeriod){
        if (hour == 2 && min > 0){
            return secondValue
        } else {
            return firstValue
        }
    }

    else if (hour > firstPeriod && hour < thirdPeriod){
        if (hour == secondPeriod && min > 0){
            return secondValue + additionalValue
        } else {
            return secondValue
        }
    }

    else if(hour >= thirdPeriod){
        if (min > 0){
            return delay * additionalValue + secondValue + additionalValue
        } else {
            return delay * additionalValue + secondValue
        }
    }
}

console.log(amountToPay(1,00)) // return 8