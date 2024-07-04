import javax.swing.JFrame;

public class GameFrame extends JFrame {

	GameFrame(){
		this.add(new GamePanel()); // Gamepanel panel = new Gamepanel();
		this.setTitle("Snake");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack(); // Faz com que o GameFrame seja dimensionado para se ajustar ao tamanho preferido de seus subcomponentes. Isso garante que todos os componentes dentro do GameFrame sejam exibidos corretamente.
		this.setVisible(true); //Torna o GameFrame visível. Sem isso, a janela não seria exibida na tela.
		this.setLocation(null);
		
	}
}
