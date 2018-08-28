window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.OperacoesVariavelEscopo = window.blockly.js.blockly.OperacoesVariavelEscopo
		|| {};

/**
 * Descreva esta função...
 */
window.blockly.js.blockly.OperacoesVariavelEscopo.inserir = function(produto,
		quantidade) {

	var itensLinha, produto, quantidade;
	itensLinha = this.cronapi.object
			.createObjectFromString('{\"pedido\":\"\",\"quantidade\":0, \"produto\":{\"nome\":\"\",\"valor_venda\":0}}');
	this.cronapi.object.setProperty(itensLinha, 'pedido', this.cronapi.screen
			.getScopeVariable('Pedido'));
	this.cronapi.object.setProperty(itensLinha, 'quantidade', quantidade);
	this.cronapi.object.setProperty(itensLinha, 'produto', produto);
	this.cronapi.screen.getScopeVariable('Lista').push(itensLinha);
	this.cronapi.screen.changeValueOfField("vars.Produto", '');
	this.cronapi.screen.changeValueOfField("vars.input6044", '');
}

/**
 * Descreva esta função...
 */
window.blockly.js.blockly.OperacoesVariavelEscopo.criar = function() {

	var itensLinha, produto, quantidade;
	this.cronapi.screen.createScopeVariable('Pedido', this.cronapi.util
			.callServerBlockly('blockly.pedidos.CriarPedido:idPedido'));
	this.cronapi.screen.createScopeVariable('Lista', []);
}
