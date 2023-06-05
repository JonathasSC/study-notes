function returnRetirement(idade, tempo){
    if (idade >= 65 && tempo >= 30 || idade >= 60 && tempo >= 25){
        return "Aposentadoria liberada!"
    } else {
        return "Aposentadoria não liberada"
    }
}

console.log(returnRetirement(60,25))