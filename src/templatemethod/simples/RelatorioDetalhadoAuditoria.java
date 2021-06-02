package templatemethod.simples;

public class RelatorioDetalhadoAuditoria extends ImpressaoTemplateMethod {

    @Override
    boolean requerAssinaturaResponsavel() {
        return true;
    }
}
