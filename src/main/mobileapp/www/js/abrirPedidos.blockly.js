window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.AbrirPedidos = window.blockly.js.AbrirPedidos || {};

/**
 * Descreva esta função...
 */
window.blockly.js.AbrirPedidos.abrir = function() {
	this.cronapi.screen.openUrl('#/app/logged/pedido', false, 0, 0);
}
