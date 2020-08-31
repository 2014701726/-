package whj.nb.motianluneureka.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import whj.nb.motianluneureka.entity.Theme;
import whj.nb.motianluneureka.service.ThemeService;
import whj.nb.vo.ResultVO;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Theme)表控制层
 *
 * @author makejava
 * @since 2020-08-25 18:51:39
 */
@RestController
@CrossOrigin
@RequestMapping("theme")
public class ThemeController {
    /**
     * 服务对象
     */
    @Resource
    private ThemeService themeService;

    @RequestMapping("index/{limit}/{pageNum}/{pageSize}")
    public ResultVO findTheme(@PathVariable Integer limit,@PathVariable Integer pageNum,@PathVariable Integer pageSize) {
        if(pageNum==null||pageNum<=0) {
            pageNum=1;
        }
        PageHelper.startPage(pageNum, pageSize);
        ResultVO<Object> resultVO = new ResultVO<>();
        try {
            List<Theme> themes = themeService.queryAll(limit,pageNum,pageSize).getThemeList();
            PageInfo<Theme> themePageInfo = new PageInfo<Theme>(themes);
            resultVO.setCode(0);
            resultVO.setT(themePageInfo);
        } catch (Exception e) {
            e.printStackTrace();
            resultVO.setCode(1);
        }
        return resultVO;
    }
}