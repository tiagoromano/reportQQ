window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.Chat = window.blockly.js.Chat || {};

/**
 * Descreva esta função...
 */
window.blockly.js.Chat.iniciar = function() {

	var modelo, mensagem, remetente, msg, i, resposta, respostaWatson;
	this.cronapi.screen.createScopeVariable('user', this.cronapi.util
			.callServerBlockly('blockly.chatbot.Chat:obter_login'));
	this.cronapi.screen.changeValueOfField("vars.chatMessages", []);
	this.cronapi.screen.changeValueOfField('vars.pedidos', []);
	this.blockly.js.Chat.iniciar_watson();
}

/**
 * Descreva esta função...
 */
window.blockly.js.Chat.modelo_mensagem = function(mensagem, remetente) {

	var modelo, mensagem, remetente, msg, i, resposta, respostaWatson;
	modelo = this.cronapi.object.createObjectFromString('{}');
	this.cronapi.object.setProperty(modelo, 'from', remetente);
	this.cronapi.object.setProperty(modelo, 'text', mensagem);
	return modelo;
}

/**
 * Descreva esta função...
 */
window.blockly.js.Chat.enviar_mensagem = function() {

	var modelo, mensagem, remetente, msg, i, resposta, respostaWatson;
	modelo = this.blockly.js.Chat.modelo_mensagem(this.cronapi.screen
			.getValueOfField("vars.message"), this.cronapi.screen
			.getValueOfField('vars.user'));
	msg = this.cronapi.screen.getValueOfField("vars.chatMessages");
	msg.push(modelo);
	this.cronapi.screen.changeValueOfField("vars.chatMessages", msg);
	resposta = this.cronapi.util.callServerBlockly(
			'blockly.chatbot.Chat:recebe_mensagem', this.cronapi.screen
					.getValueOfField("vars.message"), this.cronapi.screen
					.getScopeVariable('watsonContext'));
	this.cronapi.screen.createScopeVariable('watsonContext',
			this.cronapi.object.getProperty(resposta, 'context'));
	if (this.cronapi.logic.typeOf(this.cronapi.object.getProperty(resposta,
			'text'), 'string')) {
		modelo = this.blockly.js.Chat.modelo_mensagem(this.cronapi.object
				.getProperty(resposta, 'text'), 'Farmácia Cronapp');
		msg = this.cronapi.screen.getValueOfField("vars.chatMessages");
		msg.push(modelo);
		this.cronapi.screen.changeValueOfField("vars.chatMessages", msg);
	} else {
		var i_list = this.cronapi.object.getProperty(resposta, 'text');
		for ( var i_index in i_list) {
			i = i_list[i_index];
			modelo = this.blockly.js.Chat
					.modelo_mensagem(i, 'Farmácia Cronapp');
			msg = this.cronapi.screen.getValueOfField("vars.chatMessages");
			msg.push(modelo);
			this.cronapi.screen.changeValueOfField("vars.chatMessages", msg);
		}
	}
	this.cronapi.screen.changeValueOfField("vars.message", '');
}

/**
 * Descreva esta função...
 */
window.blockly.js.Chat.iniciar_watson = function() {

	var modelo, mensagem, remetente, msg, i, resposta, respostaWatson;
	msg = this.cronapi.screen.getValueOfField("vars.chatMessages");
	resposta = this.cronapi.util
			.callServerBlockly('blockly.chatbot.Chat:iniciar_watson');
	this.cronapi.screen.createScopeVariable('watsonContext',
			this.cronapi.object.getProperty(resposta, 'context'));
	respostaWatson = this.blockly.js.Chat.modelo_mensagem(this.cronapi.object
			.getProperty(resposta, 'text'), 'Farmácia Cronapp');
	msg.push(respostaWatson);
	this.cronapi.screen.changeValueOfField("vars.chatMessages", msg);
}
