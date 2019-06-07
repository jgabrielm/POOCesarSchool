package exemplos.aula14;

public class Hora implements Comparable<Hora>{
	private int hora;
	private int minutos;
	
	public Hora(int hora, int minutos) {
		this.hora = hora;
		this.minutos = minutos;
	}
	
	public int getHora() {
		return hora;
	}
	
	public void setHora(int hora) {
		this.hora = hora;
	}
	
	public int getMinutos() {
		return minutos;
	}
	
	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	@Override
	public String toString() {
		return this.hora + ":" + (this.minutos >= 10 ? this.minutos : "0" + this.minutos);
	}

	@Override
	public int compareTo(Hora hora2) {
		int diferencaHoras = this.getHora() - hora2.getHora();
		if(diferencaHoras != 0) {
			return diferencaHoras;
		}
		
		int diferencaMinutos = this.getMinutos() - hora2.getMinutos();
		if(diferencaMinutos != 0) {
			return diferencaMinutos;
		}
		return 0;
	}

}
