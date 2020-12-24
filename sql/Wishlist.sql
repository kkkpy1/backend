-- Insert into Wishlist
CREATE OR REPLACE PROCEDURE sp_wishlist_insert
(
    v_product_id     IN    wishlist.product_id%TYPE,
    v_member_id     IN    wishlist.member_id%TYPE,
    v_wishlist_name     IN    wishlist.wishlist_name%TYPE
)
IS
BEGIN
    INSERT INTO wishlist(wishlist_id, product_id, member_id, wishlist_name) 
    VALUES(seq_wishlist_id.NEXTVAL, v_product_id, v_member_id, v_wishlist_name); 
END;

-- select my wishlist
CREATE OR REPLACE PROCEDURE sp_wishlist_select_my_wishlist
(
    v_member_id     IN      wishlist.member_id%TYPE,
    wishlist_record    OUT     SYS_REFCURSOR
)
AS
BEGIN
    OPEN wishlist_record FOR
    SELECT wishlist_id, product_id, wishlist.member_id as member_id, wishlist_name,
    TO_CHAR(wishlist_date, 'YYYY-MM-DD') AS wishlist_date,
    product_name, product_price, product_img
    FROM wishlist INNER JOIN Product USING(product_id)

    WHERE wishlist.member_id = v_member_id;
END;

-- select friends wishlist
CREATE OR REPLACE PROCEDURE sp_wishlist_select_friends_wishlist
(
    v_member_id     IN      wishlist.member_id%TYPE,
    wishlist_record    OUT     SYS_REFCURSOR
)
AS
BEGIN
    OPEN wishlist_record FOR
    SELECT wishlist_id, product_id, wishlist.member_id as member_id, wishlist_name,
    TO_CHAR(wishlist_date, 'YYYY-MM-DD') AS wishlist_date,
    product_name, product_price, product_img
    FROM Wishlist
    INNER JOIN Product USING(product_id)
    
    WHERE wishlist.member_id in (
        SELECT friend_id from FRIENDS 
        WHERE friends.member_id = v_member_id
    );
END;

-- Wishlist update
CREATE OR REPLACE PROCEDURE sp_wishlist_update
(
    v_wishlist_id          IN       wishlist.wishlist_id%TYPE,
    v_product_id     IN    wishlist.product_id%TYPE,
    v_member_id     IN    wishlist.member_id%TYPE,
    v_wishlist_name     IN    wishlist.wishlist_name%TYPE

)
IS
BEGIN
    UPDATE wishlist
    SET product_id = v_product_id, member_id = v_member_id, wishlist_name = v_wishlist_name
    WHERE wishlist_id = v_wishlist_id;
END;

-- Wishlist Delete
CREATE OR REPLACE PROCEDURE sp_wishlist_delete
(
    v_wishlist_id          IN       wishlist.wishlist_id%TYPE
)
IS
BEGIN
    DELETE FROM wishlist
    WHERE wishlist_id = v_wishlist_id;
END;
