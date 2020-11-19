package orientadoAobjetos;

public class NotaFiscal extends FormasPagamento {
	
	public NotaFiscal(double valorFinal) {
		super(valorFinal);
	}
	private double valores;

	
	public void NotaFiscal() {
		
	}
	
	
	
	public void notaFiscal1 () 
	{
		System.out.println("\n\n\n\n\n\t\t\t\t\t\t\t\tNOTA FISCAL\n");
		System.out.println("\nGENERATIONS STORE");
		System.out.println("PRODUTOS:\t"+"VALOR:\t\tQUANTIDADE:\n");
		// carrinho		
	}
	public void notaFiscal2 ()
	{
		double impostos;
		impostos = super.getValorFinal() *0.09;
		System.out.printf("\nIMPOSTOS A SEREM PAGOS R$ %.2f",impostos,"\n\n");
		if (super.getParc() == 1)
		{ 
			System.out.printf("\n\nTOTAL A SER PAGO = R$ %.2f\n",super.getValorFinal());
			System.out.printf("\nPARCELADO EM 2X DE R$ %.2f" ,super.getParcelas(),"\n\n");
		}
		else if (super.getParc() == 2)
		{ 
			System.out.printf("\n\nTOTAL A SER PAGO = R$ %.2f\n",super.getValorFinal());
			System.out.printf("\nPARCELADO EM 3X DE R$ %.2f" ,super.getParcelas(),"\n\n");
		}
		else
		{
			System.out.printf("\n\nTOTAL A SER PAGO = R$ %.2f\n",super.getValorFinal());
		}
		System.out.print("\n\nOBRIGADO E VOLTE SEMPRE-\n");
	}
	public void valorFinal(double valor) {
		super.setValorFinal(super.getValorFinal() + valor);
	}
	
	
	
}
