package br.com.mariojp.solid.isp;

public class OfficeService {
	private final Printer printer;
	private final Scanner scanner;
	
	public OfficeService(Printer printer, Scanner scanner) {
		this.printer = printer;
		this.scanner = scanner;	
	}

	public void printReport(String content) {
		printer.print(content);
	}
	
	public void scanReport(String targetFile) {
		scanner.scan(targetFile);
	}
}
