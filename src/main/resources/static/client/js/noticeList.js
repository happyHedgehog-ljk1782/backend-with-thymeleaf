function redirectNoticeDetail(postCode, searchCondition, searchValue, orderBy, pageNo) {
    const url = '/board/detail?postType=3' +
        '&postCode=' + postCode +
        '&searchCondition=' + encodeURIComponent(searchCondition) +
        '&searchValue=' + encodeURIComponent(searchValue) +
        '&orderBy=' + encodeURIComponent(orderBy) +
        '&currentPage=' + pageNo;
    window.location.href = url;
}