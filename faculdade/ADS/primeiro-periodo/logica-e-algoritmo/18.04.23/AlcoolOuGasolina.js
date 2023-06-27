function AlcoolOuGasolina(valorAlcool,valorGasolina){
	const desejavelGasolina = valorGasolina * 0.70;
	
	if (valorAlcool > desejavelGasolina){
		return 'Não vale a pena comprar alcool.';
	} else {
		return 'Vale a pena comprar alcool.';
	}
}

console.log(AlcoolOuGasolina(6,10))