package DadosDasPessoas;

public class Pessoa {
	
		
		private double altura;
		private char genero;
		
		public Pessoa (double altura,char genero) {
			this.altura = altura;
			this.genero = genero;
		}
		
		
		public double getAltura() {
			return altura;
		}


		public void setAltura(double height) {
			this.altura = height;
		}


		public char getGenero() {
			return genero;
		}


		public void setGenero(char genero) {
			this.genero = genero;
		}

		
		public double maiorAltura(Pessoa[] vect) {
			double altura = 0;
			altura = vect[0].getAltura();
			for(int i = 1; i < vect.length; i++) {
				if(vect[i].getAltura() > altura) {
				altura = vect[i].getAltura();
				}
			}
			return altura;
		}
		
		public double menorAltura(Pessoa[] vect) {
			double altura = 0;
			altura = vect[0].getAltura();
			for(int i = 1; i < vect.length; i++) {
				if(vect[i].getAltura() < altura) {
					altura = vect[i].getAltura();
				}
			}
			return altura;
		}
		
		public double mediaFeminina(Pessoa[] vect) {
			double media = 0;
			int valorQuantidadeDeMulheres = 0;
			for(int i = 0;i < vect.length; i ++) {
				if(vect[i].getGenero() == 'F') {
					valorQuantidadeDeMulheres ++;
					media += vect[i].getAltura();
				}
			}
			media = media / valorQuantidadeDeMulheres ;
			return media;
		}
		
		public int quantidadeDeHomens(Pessoa[] vect) {
			int valorQuantidadeDeHomens = 0;
			for(int i = 0;i < vect.length; i ++) {
				if(vect[i].getGenero() == 'M') {
					valorQuantidadeDeHomens ++;
				}
			}
			return valorQuantidadeDeHomens;
		}
		public String toString(Pessoa[] vect) {
		    return "Menor Altura = "
		            + String.format("%.2f%n", menorAltura(vect))
		            + "Maior Altura = "
		            + String.format("%.2f%n", maiorAltura(vect))
		            + "Media das alturas das mulheres = "
		            + String.format("%.2f%n", mediaFeminina(vect))
		            + "Numero de homens = "
		            + String.format("%d%n", quantidadeDeHomens(vect));
		}
}
