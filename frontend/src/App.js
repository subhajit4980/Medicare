
import './App.css';
import Home from './Pages/Home';
import Template from './Pages/Template';
import Products from './Pages/Products';

// ----------------routing---------
import { createBrowserRouter, RouterProvider } from 'react-router-dom';
import Error from './Pages/Error';
import ProductDetailsPage from './Pages/ProductDetailsPage';

const router = createBrowserRouter([
  // template's
  {
    path: '/', element: <Template />,
    errorElement: <Error />, children: [
      { path: '/', element: <Home /> },
      { path: '/products', element: <Products /> },
      { path: '/products/product1', element: <ProductDetailsPage /> },
    ]
  },

]);

function App() {
  return (
    <div>
      <RouterProvider router={router} />
    </div>

  );
}

export default App;
