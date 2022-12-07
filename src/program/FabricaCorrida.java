package program;

class FabricaCorrida implements Modelo{

	@Override
	public Corrida getCorrida() {
		// TODO Auto-generated method stub
		return new CorridaSemSairDoLugar();
	}

	@Override
	public Musculacao getMusculacao() {
		return new Polichinelo();
	}
}