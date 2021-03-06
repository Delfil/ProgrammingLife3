package tudelft.ti2806.pl3;

import tudelft.ti2806.pl3.metafilter.MetaFilterController;
import tudelft.ti2806.pl3.findgenes.FindGenesController;
import tudelft.ti2806.pl3.sidebar.SideBarController;
import tudelft.ti2806.pl3.sidebar.phylotree.PhyloController;
import tudelft.ti2806.pl3.visualization.GraphController;
import tudelft.ti2806.pl3.zoombar.ZoomBarController;

/**
 * Created by Boris Mattijssen on 14-06-15.
 */
public interface ControllerContainer {

	GraphController getGraphController();

	ZoomBarController getZoomBarController();

	PhyloController getPhyloController();

	SideBarController getSideBarController();

	FindGenesController getFindGenesController();

	MetaFilterController getMetaFilterController();

}
