package com.designpatterns.decorator;

interface Dosa{
	public String makeDosa();
}

class PlainDosa implements Dosa{

	@Override
	public String makeDosa() {
		return "Plain Dosa";
	}
}

abstract class DosaDecorator implements Dosa{
	protected Dosa dosa;
	
	public DosaDecorator(Dosa dosa) {
		this.dosa=dosa;
	}
	
	public String makeDosa() {
		return dosa.makeDosa();
	}
}

class MasalaDosaDecorator extends DosaDecorator{

	public MasalaDosaDecorator(Dosa dosa) {
		super(dosa);
	}
	
	public String makeDosa() {
		return dosa.makeDosa() + addMasala();
	}

	private String addMasala() {
		return ",Masala added in dosa";
	}
}

class OnionDosaDecorator extends DosaDecorator{
	public OnionDosaDecorator(Dosa dosa) {
		super(dosa);
	}
	
	public String makeDosa() {
		return dosa.makeDosa() + addOnion();
	}

	private String addOnion() {
		return ",onion added in dosa";
	}
}
public class DosaClient {
public static void main(String[] args) {
	
	Dosa plainDosaObj=new PlainDosa();
	String plainDosa = plainDosaObj.makeDosa();
	System.out.println(plainDosa);
	
	String masalaDosa=new MasalaDosaDecorator(new PlainDosa()).makeDosa();
	System.out.println(masalaDosa);
	
	String onionDosa=new OnionDosaDecorator(plainDosaObj).makeDosa();
	System.out.println(onionDosa);
	
	
}
}
