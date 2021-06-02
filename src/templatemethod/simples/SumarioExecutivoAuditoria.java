package templatemethod.simples;

public class SumarioExecutivoAuditoria extends ImpressaoTemplateMethod {

    @Override
    boolean requerAssinaturaResponsavel() {
        return false;
    }
}
