import React from 'react'
import { BrowserRouter } from 'react-router-dom'

// components
import AppRouter from './router/AppRouter'

function App() {
  return (
    <div className="App">
      <BrowserRouter>
        <AppRouter />
      </BrowserRouter>
    </div>
  );
}

export default App;
