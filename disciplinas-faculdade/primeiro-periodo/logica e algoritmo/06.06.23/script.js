function amountToPay (entrada,saida){

    let hora_entrada = entrada[0]
    let min_entrada = entrada[1]
    let hora_saida = saida[0]
    let min_saida = saida[1]

    let minutos_entrada = hora_entrada * 60 + min_entrada
    let minutos_saida = hora_saida * 60 + min_saida

    let minutos_total = minutos_saida - minutos_entrada

    if (minutos_total < 00){
        let minutos_decimal = Math.abs(minutos_total) / 60 - 24
        
        formatado = new Date(Math.abs(minutos_decimal)
        * 3600 * 1000).toISOString().substring(11, 16)

    } else {
        let minutos_decimal = Math.abs(minutos_total) / 60
        
        formatado = new Date(Math.abs(minutos_decimal) 
        * 3600 * 1000).toISOString().substring(11, 16)
    }

    let hora = parseInt(formatado.substring(0,2))
    let min = parseInt(formatado.substring(3,5))

    if (hora <= 02){
        if (hora == 02 && min > 00){
            console.log(`Você passou ${hora}h${min}m`)
            console.log(`Valor a pagar: R$ 8.50`)
        } else {
            console.log(`Você passou ${hora}h${min}m`)
            console.log(`Valor a pagar: R$ 8.00`)
        }
    }
    if (hora > 02 && hora <= 04){
        if (hora == 04 && min > 00){
            console.log(`Você passou ${hora}h${min}m`)
            console.log(`Valor a pagar: R$ 10.50`)
        } else {
            console.log(`Você passou ${hora}h${min}m`)
            console.log(`Valor a pagar: R$ 8.50`)
        }
    }

    if (hora >= 5){
        if (hora == 05 && min == 00){
            console.log(`Você passou ${hora}h${min}m`)
            console.log(`Valor a pagar: R$ 10.50`)
        } else {

            let tempo_extra = hora - 4

            if (min > 00){
                let valor_extra = tempo_extra * 2 + 2

                console.log(`Você passou ${hora}h${min}m`)
                console.log(`Valor a pagar: R$ ${8.5 + valor_extra}`)
            } else {
                let valor_extra = tempo_extra * 2
                
                console.log(`Você passou ${hora}h${min}m`)
                console.log(`Valor a pagar: R$ ${8.5 + valor_extra}`)
            }
        }
    }
}

amountToPay([00,50],[01,30]) // 8.00
amountToPay([23,50],[3,30]) // 8.50
amountToPay([23,50],[09,30]) // 20.5