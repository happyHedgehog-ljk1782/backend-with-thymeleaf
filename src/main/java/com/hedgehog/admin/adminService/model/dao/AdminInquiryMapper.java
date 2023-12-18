package com.hedgehog.admin.adminService.model.dao;

import com.hedgehog.admin.adminService.model.dto.AdminCommentDTO;
import com.hedgehog.admin.adminService.model.dto.AdminInquiryDTO;
import com.hedgehog.admin.adminService.model.dto.AdminInquiryForm;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AdminInquiryMapper {
    List<AdminInquiryDTO> searchInquiry(AdminInquiryForm form);

    //상품문의 상태변경
    int inqStateUpdate(AdminInquiryDTO inquiryDTO);
    //상품문의 상세보기
    AdminInquiryDTO inquiryDetail(int inquiryCode);
    //상품문의 답변
//    AdminCommentDTO inquiryComment(int inquiryCode);
}

