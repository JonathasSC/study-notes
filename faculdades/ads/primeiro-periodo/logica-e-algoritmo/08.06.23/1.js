function returnValueAndTaxes(valor_produto,destino){
    let imposto

    if (isNaN(valor_produto) == true){
        console.log("Valor invalido!")

    } else {
        valor_produto = Number(valor_produto)

        if (destino != "PE" && destino != "SP" && destino != "RJ" && destino != "PB"){
            console.log("Local invalido!")

        } else {
            if(destino == "PE"){
                imposto = valor_produto * 0.07
            }
            if(destino == "PB"){
                imposto = valor_produto * 0.08
            }
            if(destino == "SP"){
                imposto = valor_produto * 0.12
            }
            if(destino == "RJ"){
                imposto = valor_produto * 0.15
            }

            console.log(`Você vai pagar: R$ ${imposto + valor_produto}`)
        }
    }
}

returnValueAndTaxes("10","PB") // return 10.8

