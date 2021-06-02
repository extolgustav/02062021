package templatemethod.simples;

public class Main {
    public static void main(String[] args) {

        RelatorioDetalhadoAuditoria rda = new RelatorioDetalhadoAuditoria();
        SumarioExecutivoAuditoria sea = new SumarioExecutivoAuditoria();

        rda.imprimir();
        sea.imprimir();


       // System.out.println("Sumario exige assinatura? "+sea.requerAssinaturaResponsavel());
       // System.out.println("Relatorio exige assinatura? "+rda.requerAssinaturaResponsavel());

    }
}
