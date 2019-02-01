package com.zwxu.common;

public class PageHelper {
    /// <summary>
    /// 分页
    /// </summary>
    /// <param name="pageSize">页容量</param>
    /// <param name="totalCount">总页数</param>
    /// <param name="currentPage">当前页数</param>
    /// <param name="className">a标签的class名称</param>
    /// <returns></returns>
    public static String Getpage(int pageSize, int totalCount, int currentPage, String className) {
        String str = "";
        if (className == null) {
            str = "<a  href='javascript:void(0)' class='mypage' data-page='%s'>%s</a> ";
        } else {
            str = "<a  href='javascript:void(0)' class='" + className + "' data-page='%s'>%s</a> ";
        }
        pageSize = pageSize == 0 ? 3 : pageSize;
        double size = (double) (totalCount + pageSize - 1) / pageSize;
        int totalPages = (int) (size > 1 ? size : 1);//总页数
        StringBuilder output = new StringBuilder();
        if (totalPages > 1) {
            if (currentPage > 1) {
                output.append(String.format(str, currentPage - 1, "上一页"));
            } else {
                output.append("<span >上一页</span>");
            }

            output.append(" ");
            int currint = 2;
            if (currentPage > 3) {
                output.append(String.format(str, 1, 1));
            }
            if (currentPage > 4) {
                output.append("<span>…</span>");
            }
            for (int i = 0; i <= 4; i++) {//一共最多显示6个页码，前面2个，后面2个
                if ((currentPage + i - currint) >= 1 && (currentPage + i - currint) < totalPages) {
                    if (currint == i) {//当前页处理
                        output.append(String.format("<span>%s</span>", currentPage));
                    } else {//一般页处理
                        output.append(String.format(str, currentPage + i - currint, currentPage + i - currint));
                    }
                }
                output.append(" ");
            }
            if (currentPage < totalPages - 1) {
                if (totalPages > currentPage + 3) {
                    output.append("<span >…</span>");
                }
            }
            if (currentPage != totalPages) {
                output.append(String.format(str, totalPages, totalPages));
            } else {
                output.append(String.format("<span>%s</span>", currentPage));
            }
            if (currentPage < totalPages) {
                //处理下一页的链接
                output.append(String.format(str, currentPage + 1, "下一页"));
            } else {
                output.append("<span >下一页</span>");
            }
            output.append(String.format("<span >共%s条</span>", totalCount));
        }
        return output.toString();
    }
}
