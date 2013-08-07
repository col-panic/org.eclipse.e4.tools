
/*global define */

define('examples/editor/swtContentAssist', [ //$NON-NLS-0$
	'orion/editor/templates' //$NON-NLS-0$
], function(mTemplates) {

	var colorValues = {
		type: "link", //$NON-NLS-0$
		values: [
			"COLOR_BLACK", //$NON-NLS-0$
			"COLOR_INFO_BACKGROUND", //$NON-NLS-0$
			"black", //$NON-NLS-0$
			"white", //$NON-NLS-0$
			"red", //$NON-NLS-0$
			"green", //$NON-NLS-0$
			"blue", //$NON-NLS-0$
			"magenta", //$NON-NLS-0$
			"yellow", //$NON-NLS-0$
			"cyan", //$NON-NLS-0$
			"grey", //$NON-NLS-0$
			"darkred", //$NON-NLS-0$
			"darkgreen", //$NON-NLS-0$
			"darkblue", //$NON-NLS-0$
			"darkmagenta", //$NON-NLS-0$
			"darkcyan", //$NON-NLS-0$
			"darkyellow", //$NON-NLS-0$
			"darkgray", //$NON-NLS-0$
			"lightgray" //$NON-NLS-0$
		]
	};
	function fromJSON(o) {
		return JSON.stringify(o).replace("}", "\\}"); //$NON-NLS-1$ //$NON-NLS-0$
	}
	var templates = [
		{
			prefix: "swt-outer-keyline-color", //$NON-NLS-0$
			description: "ctab folder keyline - keyline color", //$NON-NLS-0$
			template: "swt-outer-keyline-color: ${color:" + fromJSON(colorValues) + "};" //$NON-NLS-1$ //$NON-NLS-0$
		},
		{
			prefix: "frame-image", //$NON-NLS-0$
			description: "image - the frame image", //$NON-NLS-0$
			template: "frame-image: url(\"${uri}\");" //$NON-NLS-0$
		}
	];
	var keywords = [
		"swt-unselected-tabs-color", //$NON-NLS-0$
		"swt-selected-tabs-background", //$NON-NLS-0$
		"swt-outer-keyline-color" //$NON-NLS-0$
	];

	function SWTContentAssistProvider() {
	}
	SWTContentAssistProvider.prototype = new mTemplates.TemplateContentAssist(keywords, templates);
	
	SWTContentAssistProvider.prototype.getPrefix = function(buffer, offset, context) {
		var index = offset;
		while (index && /[A-Za-z\-\@]/.test(buffer.charAt(index - 1))) {
			index--;
		}
		return index ? buffer.substring(index, offset) : "";
	};

	return {
		SWTContentAssistProvider: SWTContentAssistProvider
	};
});