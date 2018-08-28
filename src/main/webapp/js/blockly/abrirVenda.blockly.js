window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.AbrirVenda = window.blockly.js.blockly.AbrirVenda
		|| {};

/**
 * Descreva esta função...
 */
window.blockly.js.blockly.AbrirVenda.novaVenda = function() {

	var item, objeto, pedidoId;
	this.cronapi.screen.openUrl('/webapp/#/home/logged/novaVenda', false, 800,
			600);
}

/**
 * abrirVenda
 */
window.blockly.js.blockly.AbrirVenda.abrir = function(pedidoId) {

	var item, objeto, pedidoId;
	this.cronapi.screen.changeView("#/home/logged/venda", [{
		pedidoId : pedidoId
	}]);
}
