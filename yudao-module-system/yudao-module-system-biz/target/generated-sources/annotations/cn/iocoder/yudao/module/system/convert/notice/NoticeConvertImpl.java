package cn.iocoder.yudao.module.system.convert.notice;

import cn.iocoder.yudao.framework.common.pojo.PageResult;
import cn.iocoder.yudao.module.system.controller.admin.notice.vo.NoticeCreateReqVO;
import cn.iocoder.yudao.module.system.controller.admin.notice.vo.NoticeRespVO;
import cn.iocoder.yudao.module.system.controller.admin.notice.vo.NoticeUpdateReqVO;
import cn.iocoder.yudao.module.system.dal.dataobject.notice.NoticeDO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-05-31T19:44:54+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 1.8.0_311 (Oracle Corporation)"
)
public class NoticeConvertImpl implements NoticeConvert {

    @Override
    public PageResult<NoticeRespVO> convertPage(PageResult<NoticeDO> page) {
        if ( page == null ) {
            return null;
        }

        PageResult<NoticeRespVO> pageResult = new PageResult<NoticeRespVO>();

        pageResult.setList( noticeDOListToNoticeRespVOList( page.getList() ) );
        pageResult.setTotal( page.getTotal() );

        return pageResult;
    }

    @Override
    public NoticeRespVO convert(NoticeDO bean) {
        if ( bean == null ) {
            return null;
        }

        NoticeRespVO noticeRespVO = new NoticeRespVO();

        noticeRespVO.setTitle( bean.getTitle() );
        noticeRespVO.setType( bean.getType() );
        noticeRespVO.setContent( bean.getContent() );
        noticeRespVO.setStatus( bean.getStatus() );
        noticeRespVO.setId( bean.getId() );
        noticeRespVO.setCreateTime( bean.getCreateTime() );

        return noticeRespVO;
    }

    @Override
    public NoticeDO convert(NoticeUpdateReqVO bean) {
        if ( bean == null ) {
            return null;
        }

        NoticeDO noticeDO = new NoticeDO();

        noticeDO.setId( bean.getId() );
        noticeDO.setTitle( bean.getTitle() );
        noticeDO.setType( bean.getType() );
        noticeDO.setContent( bean.getContent() );
        noticeDO.setStatus( bean.getStatus() );

        return noticeDO;
    }

    @Override
    public NoticeDO convert(NoticeCreateReqVO bean) {
        if ( bean == null ) {
            return null;
        }

        NoticeDO noticeDO = new NoticeDO();

        noticeDO.setTitle( bean.getTitle() );
        noticeDO.setType( bean.getType() );
        noticeDO.setContent( bean.getContent() );
        noticeDO.setStatus( bean.getStatus() );

        return noticeDO;
    }

    protected List<NoticeRespVO> noticeDOListToNoticeRespVOList(List<NoticeDO> list) {
        if ( list == null ) {
            return null;
        }

        List<NoticeRespVO> list1 = new ArrayList<NoticeRespVO>( list.size() );
        for ( NoticeDO noticeDO : list ) {
            list1.add( convert( noticeDO ) );
        }

        return list1;
    }
}
