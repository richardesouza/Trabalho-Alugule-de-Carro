carro carros[];
int capacidade=10;
int quantidade=0;

 JFrame janela = new JFrame();
 JTextField nome = new JTextField("digite o nome do carro");
 JTextField marca = new JTextField("digite a marca do carro");
 JTextField preço = new JTextField("digite o preço do carro");
 JTextField codigo = new JTextField("digite o codigo do carro");

 JButton botao = new JButton("pesquisar"); 
 JButton botao2 = new JButton("registrar"); 
 

Locadora loc = new Locadora();



public int getCapacidade() {
	return capacidade;
}

public void setCapacidade() {
	carros[10]= new Carro();
	
}

public int getQuantidade() {
	return quantidade;
}

public  void ggo() {

	
	
	
	botao.addActionListener(new ManipularPesquisa());
    botao2.addActionListener(new ManipularRegistro());
    janela.setLayout(null);
    addComponent(janela,nome,0,0,170,20);
	addComponent(janela,marca,0,55,170,20);
	addComponent(janela,preço,0,110,170,20);
	addComponent(janela,codigo,0,165,170,20);
	addComponent(janela,botao,180,27,100,40);
	addComponent(janela,botao2,180,137,100,40);
	janela.setDefaultCloseOperation(HIDE_ON_CLOSE);
	janela.setSize(300,300);
    janela.setVisible(true);
	
	
	
	
	
}

public static void main(String args[]){
	
	Locadora ld = new Locadora();
	ld.ggo();
}

public void cadastrarCarro(){
	if(this.quantidade<this.capacidade){
		carros[this.quantidade]=new Carro() ;
		this.quantidade++;
	}
	
	}
	public Carro pesquisarCarro(String n){
		for(int i = 0; i < quantidade;i++){
			if (carros[i].getNome()==n)
					return carros[i];
		}
	 return null;
	}

	private  void addComponent(Container container,Component c,int x,int y,int width,int height) 
	{ 
		c.setBounds(x,y,width,height); 
		container.add(c); 
	} 

	class ManipularRegistro implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			loc.setCapacidade();
			loc.cadastrarCarro();
			
			carros[quantidade-1].setNome(nome.getText());
			carros[quantidade-1].setCodigo(Integer.parseInt(codigo.getText()));
			carros[quantidade-1].setMarca(marca.getText());
			carros[quantidade-1].setPreço(Integer.parseInt(preço.getText()));
		
			
		}
	}
		class ManipularPesquisa implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent arg0) {
						JOptionPane.showMessageDialog(null,loc.pesquisarCarro(nome.getText()).getNome());			
				
				
			}
		
		
		
	}