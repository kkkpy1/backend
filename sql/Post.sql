-- 글 작성하기
CREATE OR REPLACE PROCEDURE sp_post_insert
(
    v_product_id    IN  post.product_id%TYPE,
    v_member_id     IN  post.member_id%TYPE,
    v_post_content  IN  post.post_content%TYPE
)
IS
BEGIN
    INSERT INTO POST(post_id, product_id, member_id, post_content)
    VALUES(seq_post_id.NEXTVAL, v_product_id, v_member_id, v_post_content);
END;


-- select my post
CREATE OR REPLACE PROCEDURE sp_post_select_my_post
(
    v_member_id     IN      post.member_id%TYPE,
    record    OUT     SYS_REFCURSOR

)
AS
BEGIN
    OPEN record FOR
    SELECT product_id, product_name, product_img, product_price, product_brand, product_category,
    post_id, post.member_id, post_content, post_shared_range, post_like_count, 
    TO_CHAR(post_date, 'YYYY-MM-DD') AS post_date
    FROM POST inner join product using(product_id)
    WHERE post.member_id = v_member_id;
END;

-- select one post
CREATE OR REPLACE PROCEDURE sp_post_select
(
    v_post_id     IN      post.post_id%TYPE,
    record    OUT     SYS_REFCURSOR

)
AS
BEGIN
    OPEN record FOR
    SELECT product_id, product_name, product_img, product_price, product_brand, product_category,
    post_id, post.member_id, post_content, post_shared_range, post_like_count, 
    TO_CHAR(post_date, 'YYYY-MM-DD') AS post_date
    FROM POST inner join product using(product_id)
    WHERE post_id = v_post_id;
END;

-- 글 수정하기
CREATE OR REPLACE PROCEDURE sp_post_update
(
    v_post_id       IN      POST.post_id%TYPE,
    v_product_id       IN      POST.product_id%TYPE,
    v_member_id       IN      POST.member_id%TYPE,
    v_post_content     IN      POST.post_content%TYPE
)
IS
BEGIN
    UPDATE POST
    SET product_id = v_product_id, post_content = v_post_content
    WHERE post_id = v_post_id
    AND member_id = v_member_id;
    
END;