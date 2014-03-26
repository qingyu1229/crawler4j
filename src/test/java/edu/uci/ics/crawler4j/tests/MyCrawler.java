package edu.uci.ics.crawler4j.tests;

import edu.uci.ics.crawler4j.crawler.CrawlController;
import edu.uci.ics.crawler4j.crawler.Page;
import edu.uci.ics.crawler4j.crawler.WebCrawler;
import edu.uci.ics.crawler4j.url.WebURL;


public class MyCrawler extends WebCrawler{
	

	
	
	@Override
	public void init(int myId, CrawlController crawlController) {
		// TODO Auto-generated method stub
		super.init(myId, crawlController);
	}

	@Override
	protected void handlePageStatusCode(WebURL webUrl, int statusCode,
			String statusDescription) {
		// TODO Auto-generated method stub
		super.handlePageStatusCode(webUrl, statusCode, statusDescription);
	}

	@Override
	public Thread getThread() {
		// TODO Auto-generated method stub
		return super.getThread();
	}

	@Override
	public boolean isNotWaitingForNewURLs() {
		// TODO Auto-generated method stub
		return super.isNotWaitingForNewURLs();
	}

	@Override
	public void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
	}

	@Override
	public void onBeforeExit() {
		// TODO Auto-generated method stub
		super.onBeforeExit();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
	}

	@Override
	public boolean shouldVisit(WebURL url) {
		// TODO Auto-generated method stub
		return super.shouldVisit(url);
	}

	@Override
	public void visit(Page page) {
		// TODO Auto-generated method stub
		super.visit(page);
	}

	@Override
	public void setThread(Thread myThread) {
		// TODO Auto-generated method stub
		super.setThread(myThread);
	}

	public static void main(String[] args) {
		
		
		
	}
}
