package templatemethod.simples;

public abstract class ImpressaoTemplateMethod {

    void imprimir(){
        System.out.println("- Imprimindo documento...");

        if(requerAssinaturaResponsavel())
            System.out.println("- Documento impresso COM assinatura do responsavel");
        else
            System.out.println("- Documento impresso SEM assinatura do responsavel");

    }

    abstract boolean requerAssinaturaResponsavel();
}
