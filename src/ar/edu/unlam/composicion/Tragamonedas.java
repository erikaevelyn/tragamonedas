package ar.edu.unlam.composicion;

public class Tragamonedas {

	private Tambor tambor1;
	private Tambor tambor2;
	private Tambor tambor3;
	private Integer resultTambor1;
	private Integer resultTambor2;
	private Integer resultTambor3;
	
	public Tragamonedas (){
		this.tambor1 = new Tambor();
		this.tambor2 = new Tambor();
		this.tambor3 = new Tambor();		
	}
	
	public void jugar(){
		this.resultTambor1 = this.tambor1.girar();
		this.resultTambor2 = this.tambor2.girar();
		this.resultTambor3 = this.tambor3.girar();
	}
	
	public Integer getTambor1(){
		return this.resultTambor1;
	}
	
	public Integer getTambor2(){
		return this.resultTambor2;
	}
	
	public Integer getTambor3(){
		return this.resultTambor3;
	}
}
