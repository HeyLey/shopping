<div class="data-container">
    <img src="${product_image2}" class="image-preview"/>

    <div class="content-container">
        <form action="/basket.jsp" method="post">
            <div class="product-header">${product_name}</div>
            <div class="price">${product_price}</div>
            <div class="main-param">
            ${color}: <select name="color">
                <option value="${product_color1}">${product_color1}</option>
                <option value="${product_color2}">${product_color2}</option>
                <option value="${product_color3}">${product_color3}</option>
            </select><br/>
            ${size}:
                <select name="sz">
                    <option value="${s1}">${s1}</option>
                    <option value="${s2}">${s2}</option>
                    <option value="${s3}">${s3}</option>
                </select><br/>
            </div>
            <div class="size_tab">
                <a href="/menu/size_table.jsp">${size_table}</a>
            </div>

            <input type="hidden" name="product_id" value="${product_id}">
            <input class="big-button" type="submit" value="${buy_button}">
        </form>
    </div>
    <div id="tabs-container">
        <ul class="tabs-menu">
            <li ${tab1_class}><a href="#tab-1">О товаре</a></li>
            <li ${tab2_class}><a href="#tab-2">Подробное описание</a></li>
            <li ${tab3_class}><a href="#tab-3">Отзывы</a></li>
        </ul>
    </div>
    <div class="tab">
        <div id="tab-1" class="tab-content" ${tab1_style}>
        ${product_description}
        </div>
        <div id="tab-2" class="tab-content" ${tab2_style}>
        ${long_description}
        </div>
        <div id="tab-3" class="tab-content" ${tab3_style}>
            <div id=comments>
            ${comments}
            </div>
        <#if userLogged>
            <textarea id="comment" rows="4" cols="50"></textarea><br/><br/><br/>
            <button is="submit" class="small-buy-button" onclick="comment(${product_id})">Комментировать</button>
        <#else>
            <p>Вам нужно авторизоваться, чтобы оставлять комментарии.</p>
        </#if>
        </div>
    </div>
</div>