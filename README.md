
# Projeto de Automação Tiago Ferreira
> Tutorial para automação APP Android - JAVA


## Guia de instalação
- Todo o código do projeto se encontra no repositório

1. Dependências Globais

    * Instalar Nodejs > https://nodejs.org/en/download/
    - Recomendo utilizar a última versão disponível
	
	* Instalar Java SE Development Kit 8u321 > https://www.oracle.com/java/technologies/downloads/#java8
    - Recomendo utilizar esta versão
	
	* Instalar Appium Server > npm install -g appium
    - Comando para ser executado no cmd. Recomendo utilizar desta maneira.
	
	* Instalar Android Studio > https://developer.android.com/studio
	- Recomendo utilizar a última versão disponível
	
	* Baixar Eclipse IDE for Java Developers > https://www.eclipse.org/downloads/packages/release/2021-12/r/eclipse-ide-java-developers
	- Não precisa instalar, só executar

    
2. Preparar o Android Studio
	* Abra o Android Studio, vá em SDK Manager, aba SDK Tools, tire a seleção do checkbox "Hide Obsolete Packges", e instale o Android SDk Plataform-Tools e Android SDK Tools
	* Abra o Android Studio, vá em AVD Manager, crie um novo dispositivo com o google play
		
3. Variáveis de Ambiente
	
	* Preparas as seguintes variavies de ambiente
	- Variáveis do Sistema
		* Nova variavel: NODE_HOME > C:\Program Files\nodejs 
		* Nova variavel: ANDRID_HOME > C:\Users\tidferreira\AppData\Local\Android\Sdk 
		* Nova variavel: JAVA_HOME >C:\Program Files\Java\jdk1.8........ 
		* Add Path > C:\Program Files (x86)\Common Files\Oracle\Java\javapath 
		* Add Path > C:\Program Files\Java\jdk1.8........\lib 
		* Add Path > C:\Users\tidferreira\AppData\Local\Android\Sdk\tools 
		* Add Path > C:\Users\tidferreira\AppData\Local\Android\Sdk\tools\bin 
		* Add Path > C:\Users\tidferreira\AppData\Local\Android\Sdk\platform-tools 
		* Add Path > C:\Users\tidferreira\AppData\Roaming\npm 
		* Add Path > C:\Program Files\nodejs 
		* Add Path > C:\Program Files\nodejs\node_modules\npm\bin


### Executar Testes
	Inicie o servidor appium no prompt
		$ appium
		
	Abra o Android Studio, clique em AVD Manager, abra o dispositivo que foi criado, deixe carregar completamente
	
	Abra o projeto pelo Eclipse: File, Open Projects from File System
	Vá até a pasta com os arquivos .java, abra o arquivo, clique com o botão direito no código, escolha a opção Run As, Java Application
	O sistema terá que apresentar o log no servidor Appium e executar a automação no simulador


### Resources

##### [Java Documentation](https://docs.oracle.com/javase/7/docs/api/)

##### [Nodejs Documentation](https://nodejs.org/en/docs/)

##### [Appium Documentation](https://appium.io/docs/en/about-appium/api/)

##### [Android Documentation](https://developer.android.com/docs)

##### [Eclipse Documentation](https://www.eclipse.org/documentation/)

##### [Stack Overflow](http://stackoverflow.com/)
