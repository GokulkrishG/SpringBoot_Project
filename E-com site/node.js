document.addEventListener('DOMContentLoaded', () => {
    const productList = document.getElementById('product-list');
    const productsSection = document.getElementById('products');
    const viewProductsButton = document.getElementById('view-products');

    viewProductsButton.addEventListener('click', (event) => {
        event.preventDefault();
        fetchProducts();
    });

    async function fetchProducts() {
        try {
            const response = await fetch('http://localhost:8080/api/products');
            if (!response.ok) {
                throw new Error('Network response was not ok');
            }
            const products = await response.json();
            renderProducts(products);
            productsSection.classList.remove('hide');
        } catch (error) {
            console.error('There has been a problem with your fetch operation:', error);
        }
    }

    function renderProducts(products) {
        productList.innerHTML = ''; // clear previous products
        products.forEach(product => {
            const productCard = document.createElement('div');
            productCard.classList.add('product-card');
            productCard.innerHTML = `
                <img src="https://via.placeholder.com/300" alt="${product.name}">
                <h3>${product.name}</h3>
                <p class="price">$${product.price}</p>
                <button class="add-to-cart">Add to Cart</button>
            `;
            productList.appendChild(productCard);
        });
    }
});