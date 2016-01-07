package br.uece.eada.teste;

public class Trello {

	private static boolean isWindows = System.getProperty("os.name").toLowerCase().contains("windows");
	public static final String PATH_PHANTOMJS = isWindows ? "C:\\marcos\\phantomjs.exe":"/usr/bin/phantomjs";
	public static final String URL 		= isWindows ? "http://localhost:8080/AlunoOnlineTest":"http://93.188.161.196:8080/AlunoOnlineTest";
	public static final String TOKEN 	= "a5948f990dce6320b68739410ee0ca92b57956233f7cc1a1daaa6ef47feb01f0";
	public static final String KEY 		= "9d31db58c7b43cb5b11e0832df3a6bc2";
}
