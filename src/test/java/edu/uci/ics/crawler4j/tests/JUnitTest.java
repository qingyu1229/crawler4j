package edu.uci.ics.crawler4j.tests;


import org.junit.Test;

import edu.uci.ics.crawler4j.crawler.CrawlConfig;
import edu.uci.ics.crawler4j.crawler.CrawlController;
import edu.uci.ics.crawler4j.fetcher.PageFetcher;
import edu.uci.ics.crawler4j.robotstxt.RobotstxtConfig;
import edu.uci.ics.crawler4j.robotstxt.RobotstxtServer;

public class JUnitTest {

	@Test
	public void test() {
		
		String crawlStorageFolder = "D:\\Crawler\\data";  
		int numberOfCrawlers = 7;  
		CrawlConfig config = new CrawlConfig();  
		config.setCrawlStorageFolder(crawlStorageFolder);  
		PageFetcher pageFetcher = new PageFetcher(config); 
		RobotstxtConfig robotstxtConfig = new RobotstxtConfig(); 
		
		RobotstxtServer robotstxtServer = new RobotstxtServer(robotstxtConfig, pageFetcher); 
		
		try {
			CrawlController controller = new CrawlController(config, pageFetcher, robotstxtServer);
			controller.addSeed("http://www.1688.com");  
			
			controller.start(MyCrawler.class, numberOfCrawlers);  
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
