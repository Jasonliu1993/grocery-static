package com.jwebcoder.grocerystatic.utilities;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;

/**
 * Created by Jason on 11/11/2017.
 */

@Component
public class SharingServiceUtility {

    /*@Autowired
    private CustomProperty customProperty;

    @Autowired
    private TechSharingServiceImpl techSharingService;

    @Autowired
    private SoftwareSharingServiceImpl softwareSharingService;

    @Autowired
    private PhotographyService photographyService;

    @Autowired
    private NewsSharingServiceImpl newsSharingService;

    @Autowired
    private FoodSharingServiceImpl foodSharingService;

    @Autowired
    private ArticleSharingServiceImpl articleSharingService;

    @Autowired
    private AdminService adminService;*/


    public ModelMap proceedTypeAndPageIndex(ModelMap modelMap, String type, String path, Integer pageIndex, StringBuffer redirectPath) {

        String full = path.replace("{type}", type);
        modelMap.addAttribute("CurrentType", type);

        if (redirectPath != null) {
            if ("photography".equals(type)) {
                redirectPath.append("/admin/admin_photography");
            } else if ("messageBoardTitle".equals(type)) {
                redirectPath.append("/admin/admin_message_board_title");
            } else if ("visitorInfo".equals(type)) {
                redirectPath.append("/admin/admin_visitor_info");
            } else {
                redirectPath.append("/admin/admin_index");
            }
        }

        switch (type) {

            case "article":

//                modelMap.addAttribute("SharingPagings", PackingInfo.changeData2Message(articleSharingService.getSharingByPaging(pageIndex, Integer.valueOf(customProperty.getAdminPageSize()))));

                modelMap.addAttribute("Paginations", PackingInfo.changeData2Message(new PaginationUtility(
                        pageIndex.toString(),
//                        customProperty.getPaginationDisplayNum(),
                        null,
                        full,
                        false,
//                        String.valueOf(articleSharingService.getSharingCount()),
                        null,
//                        customProperty.getAdminPageSize())));
                        null)));

                break;
            case "software":

//                modelMap.addAttribute("SharingPagings", PackingInfo.changeData2Message(softwareSharingService.getSharingByPaging(pageIndex, Integer.valueOf(customProperty.getAdminPageSize()))));

                /*modelMap.addAttribute("Paginations", PackingInfo.changeData2Message(new PaginationUtility(
                        pageIndex.toString(),
                        customProperty.getPaginationDisplayNum(),
                        full,
                        false,
                        String.valueOf(softwareSharingService.getSharingCount()),
                        customProperty.getAdminPageSize())));*/

                break;
            case "photography":

                /*modelMap.addAttribute("SharingPagings", PackingInfo.changeData2Message(photographyService.getPhotographyDetailBypaging(pageIndex, Integer.valueOf(customProperty.getAdminPageSize()))));

                modelMap.addAttribute("Paginations", PackingInfo.changeData2Message(new PaginationUtility(
                        pageIndex.toString(),
                        customProperty.getPaginationDisplayNum(),
                        full,
                        false,
                        String.valueOf(photographyService.getPhotographyDetailCount()),
                        customProperty.getAdminPageSize())));*/

                break;
            case "news":

                /*modelMap.addAttribute("SharingPagings", PackingInfo.changeData2Message(newsSharingService.getSharingByPaging(pageIndex, Integer.valueOf(customProperty.getAdminPageSize()))));

                modelMap.addAttribute("Paginations", PackingInfo.changeData2Message(new PaginationUtility(
                        pageIndex.toString(),
                        customProperty.getPaginationDisplayNum(),
                        full,
                        false,
                        String.valueOf(newsSharingService.getSharingCount()),
                        customProperty.getAdminPageSize())));*/

                break;
            case "food":

               /* modelMap.addAttribute("SharingPagings", PackingInfo.changeData2Message(foodSharingService.getSharingByPaging(pageIndex, Integer.valueOf(customProperty.getAdminPageSize()))));

                modelMap.addAttribute("Paginations", PackingInfo.changeData2Message(new PaginationUtility(
                        pageIndex.toString(),
                        customProperty.getPaginationDisplayNum(),
                        full,
                        false,
                        String.valueOf(foodSharingService.getSharingCount()),
                        customProperty.getAdminPageSize())));*/

                break;

            case "visitorInfo":
                /*modelMap.addAttribute("VisitorInfoPagings", PackingInfo.changeData2Message(adminService.getClientInfoByPaging(pageIndex, Integer.valueOf(customProperty.getVisitorInfoPageSize()))));

                modelMap.addAttribute("Paginations", PackingInfo.changeData2Message(new PaginationUtility(
                        pageIndex.toString(),
                        customProperty.getPaginationDisplayNum(),
                        full,
                        false,
                        String.valueOf(adminService.getVisitorInfoCount()),
                        customProperty.getAdminPageSize())));*/
                break;

            default:
                /*modelMap.addAttribute("SharingPagings", PackingInfo.changeData2Message(techSharingService.getSharingByPaging(pageIndex, Integer.valueOf(customProperty.getAdminPageSize()))));

                modelMap.addAttribute("Paginations", PackingInfo.changeData2Message(new PaginationUtility(
                        pageIndex.toString(),
                        customProperty.getPaginationDisplayNum(),
                        full,
                        false,
                        String.valueOf(techSharingService.getSharingCount()),
                        customProperty.getAdminPageSize())));*/
                break;

        }

        return modelMap;
    }

}
