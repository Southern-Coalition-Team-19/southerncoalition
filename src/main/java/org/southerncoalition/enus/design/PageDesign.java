package org.southerncoalition.enus.design;  

import java.util.List;

import org.southerncoalition.enus.cluster.Cluster;
import org.southerncoalition.enus.wrap.Wrap;

/**
 * Model: true
 * Api: true
 * Indexed: true
 * Saved: true
 * 
 * ApiTag.enUS: Page Design
 * ApiUri.enUS: /api/page-design
 * 
 * ApiMethod.enUS: PUTImport
 * ApiMethod.enUS: PUTMerge
 * ApiMethod.enUS: PUTCopy

 * ApiMethod: POST
 * ApiMethod: PATCH
 * ApiMethod: GET
 * ApiMethod.enUS: Search
 * 
 * ApiMethod.enUS: AdminSearch
 * ApiUri.AdminSearch.enUS: /api/admin/page-design
 * RoleUtilisateurAdminSearch.enUS: true
 * 
 * ApiMethod.enUS: SearchPage
 * Page.SearchPage.enUS: PageDesignPage
 * PageSuper.SearchPage.enUS: ClusterPage
 * ApiUri.SearchPage.enUS: /page-design
 * 
 * ApiMethod.enUS: DesignDisplaySearchPage
 * Page.DesignDisplaySearchPage.enUS: DesignDisplayPage
 * PageSuper.DesignDisplaySearchPage.enUS: ClusterPage
 * ApiUri.DesignDisplaySearchPage.enUS: /page
 * 
 * ApiMethod.enUS: DesignPdfSearchPage
 * Page.DesignPdfSearchPage.enUS: DesignPdfPage
 * PageSuper.DesignPdfSearchPage.enUS: ClusterPage
 * ApiUri.DesignPdfSearchPage.enUS: /pdf
 * ApiTypeMedia200DesignPdfSearchPage: application/pdf
 * 
 * ApiMethod.enUS: DesignEmailSearchPage
 * Page.DesignEmailSearchPage.enUS: DesignEmailPage
 * PageSuper.DesignEmailSearchPage.enUS: ClusterPage
 * ApiUri.DesignEmailSearchPage.enUS: /email
 * 
 * ApiMethod.enUS: HomePageSearchPage
 * Page.HomePageSearchPage.enUS: DesignDisplayPage
 * PageSuper.HomePageSearchPage.enUS: ClusterPage
 * ApiUri.HomePageSearchPage.enUS: /
 * 
 * AName.enUS: a page design
 * Color: khaki
 * IconGroup: regular
 * IconName: drafting-compass
 * NameVar.frFR: design-page
 * NameVar.enUS: page-design
 * 
 * Role.frFR: SiteAdmin
 * Role.enUS: SiteAdmin
 * PublicRead: true
 * 
 * Sort.asc: pageDesignCompleteName
 * 
 * Rows: 100
 **/    
public class PageDesign extends PageDesignGen<Cluster> {

	/**
	 * {@inheritDoc}
	 * Indexed: true
	 * Stored: true
	 * Description.enUS: The primary key of the design in the database. 
	 * DisplayName.enUS: key
	 */            
	protected void _pageDesignKey(Wrap<Long> c) {
		c.o(pk);
	}

	/**
	 * {@inheritDoc}
	 * Indexed: true
	 * Stored: true
	 * Attribute: PageDesign.parentDesignKeys
	 * DisplayName.enUS: child designs
	*/  
	protected void _childDesignKeys(List<Long> c) {
	}

	/**
	 * {@inheritDoc}
	 * Indexed: true
	 * Stored: true
	 * Attribute: PageDesign.childDesignKeys
	 * HtmlRow: 5
	 * HtmlCell: 1
	 * DisplayName.enUS: parent designs
	*/  
	protected void _parentDesignKeys(List<Long> c) {
	}

	/**  
	 * {@inheritDoc}
	 * Indexed: true
	 * Stored: true
	 * Attribute: HtmlPart.pageDesignKeys
	 * HtmlRow: 6
	 * HtmlCell: 1
	 * DisplayName.enUS: parts
	 */           
	protected void _htmlPartKeys(List<Long> o) {}

	/**   
	 * {@inheritDoc}
	 * Indexed: true
	 * Stored: true
	 * VarH2: true
	 * VarTitle: true
	 * Define: true
	 * HtmlRow: 3
	 * HtmlCell: 1
	 * DisplayName.enUS: name
	 */ 
	protected void _pageDesignCompleteName(Wrap<String> c) {
		c.o("enrollment design");
	}

	/**
	 * {@inheritDoc}
	 * Define: true
	 * HtmlRow: 3
	 * HtmlCell: 2
	 * DisplayName.enUS: hidden
	 * Indexed: true
	 * Stored: true
	 */                
	protected void _designHidden(Wrap<Boolean> c) {
		c.o(false);
	}

	/**   
	 * {@inheritDoc}
	 * Indexed: true
	 * Stored: true
	 * Define: true
	 * HtmlRow: 4
	 * HtmlCell: 1
	 * DisplayName.enUS: content type
	 */ 
	protected void _pageContentType(Wrap<String> c) {
		c.o("text/html;charset=UTF-8");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override() protected void  _objectTitle(Wrap<String> c) {
		c.o(pageDesignCompleteName);
	}
}
