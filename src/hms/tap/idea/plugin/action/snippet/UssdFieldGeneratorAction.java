package hms.tap.idea.plugin.action.snippet;

import hms.tap.idea.plugin.file.templates.snippet.CodeSnippet;
import hms.tap.idea.plugin.util.IconUtil;
import hms.tap.idea.plugin.util.MessageUtil;
import hms.tap.idea.plugin.file.templates.snippet.CodeSnippet;
import hms.tap.idea.plugin.util.MessageUtil;

/**
 * Created by isuru on 4/19/15.
 */
public class UssdFieldGeneratorAction extends CodeSnippetGeneratorAction {

    public UssdFieldGeneratorAction() {
        super(MessageUtil.message("ctap.snippet.ussd.client.generate.text"), MessageUtil.message("ctap.snippet.ussd.client.generate.description"), IconUtil.ServiceClassIcon.USSD);
    }

    @Override
    public CodeSnippet codeSnippet() {
        return CodeSnippet.USSD;
    }
}
